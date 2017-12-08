package banco;

/**
 *
 * @author DEV-ITEC
 */
public class GerenciadorDeImpostoDeRenda {

    private double total;

    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.getTributos();
    }

    public double getTotal() {
        return this.total;
    }
}
