package conta;

/**
 *
 * @author DEV-ITEC
 */
public abstract class Conta {

    private int numero;
    private double saldo;
    private double limite;
    private Cliente titular;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta() {

    }

    public void saca(double valor) {
        try {
            if (valor <= this.saldo) {
                this.saldo -= valor;
                System.out.println("Você sacou " + getSaldo());
                throw new SaldoInsuficienteException("Saldo Insuficiente " + "tente um valor menor.");
            }
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deposita(double valor) {
        try {
            this.saldo += valor;
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void transfere(Conta destino, double valor) {
        saca(valor);
        destino.deposita(valor);
    }

    public abstract void atualiza(double taxa);

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }
}
