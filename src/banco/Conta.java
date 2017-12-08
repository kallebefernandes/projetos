package banco;

/**
 *
 * @author kalebe
 */
public abstract class Conta {

    private int numero;
    double saldo;
    private double limite;
    private Cliente titular;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta() {

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            double novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;
            return true;
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou) {
            return false;
        } else {
            this.deposita(valor);
            return true;
        }
    }

    public abstract void atualiza(double taxa);
}
