package banco;

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
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Você sacou " + getSaldo());
        } else {
            System.out.println("Saldo indisponível.");
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
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
