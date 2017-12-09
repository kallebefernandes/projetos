package banco;

/**
 *
 * @author DEV-ITEC
 */
public class GerenciadorDeIR {

    private double total;

    public void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.getTributavel();
    }

    public double getTotal() {
        return this.total;
    }
}
