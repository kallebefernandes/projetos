package banco;

/**
 *
 * @author DEV-ITEC
 */
public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
        System.out.printf("O saldo é: %.2f", getSaldo());
    }

    @Override
    public double getTributos() {
        return this.getSaldo() * 0.01;
    }
}
