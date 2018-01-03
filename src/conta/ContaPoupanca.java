package conta;

/**
 *
 * @author DEV-ITEC
 */
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

    public ContaPoupanca(int numero) {
        super(numero);
    }

    private ContaPoupanca() {
    }

    @Override
    public void atualiza(double taxa) {
        ContaPoupanca cc = new ContaPoupanca(1);
        cc.setSaldo(getSaldo() * taxa);
    }

    @Override
    public int compareTo(ContaPoupanca o) {
        ContaPoupanca cc = new ContaPoupanca();
        return o.getTitular() != null ? Integer.compare(Integer.parseInt(cc.getTitular().getNome()), Integer.parseInt(o.getTitular().getNome()))
                : Integer.compare(this.getNumero(), o.getNumero());
    }
}
