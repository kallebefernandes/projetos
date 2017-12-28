package conta;

import conta.Conta;

/**
 *
 * @author DEV-ITEC
 */
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public void atualiza(double taxa) {
        ContaPoupanca cc = new ContaPoupanca(1);
        cc.setSaldo(getSaldo() * taxa);
    }

    @Override
    public int compareTo(ContaPoupanca o) {
        return Integer.compare(this.getNumero(), o.getNumero());
    }
}
