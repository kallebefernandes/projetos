package conta;

import interfaces.Tributavel;

/**
 *
 * @author DEV-ITEC
 */
public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int numero) {
        super();
    }

    @Override
    public void atualiza(double taxa) {
        ContaCorrente cc = new ContaCorrente(1);
        cc.setSaldo(getSaldo() * taxa * 2);
    }

    public void depositaContaCorrente(double valor) {
        super.deposita(valor);
    }

    @Override
    public double getTributavel() {
        return this.getSaldo() * 0.01;
    }
}
