package banco;

/**
 *
 * @author kalebe
 */
public class Conta {

    int numero;
    double saldo;
    double limite;
    Cliente titular;

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
}
