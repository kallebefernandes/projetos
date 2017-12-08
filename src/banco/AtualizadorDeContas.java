package banco;

/**
 *
 * @author DEV-ITEC
 */
public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println(c.getSaldo());
        saldoTotal = selic * c.getSaldo();
        System.out.println(getSaldoTotal());
        saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

}
