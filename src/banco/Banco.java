package banco;

/**
 *
 * @author DEV-ITEC
 */
public class Banco {

    private Conta conta[];
    private int capacidade;

    public Banco(int capacidade) {
        this.capacidade = capacidade;
        conta = new Conta[this.capacidade];
    }

    public void adicionaConta(Conta c) {
        for (int i = 0; i < conta.length; i++) {
            if (conta[i] != null) {
                conta[i] = c;
            } else {
                System.out.println("Não é possível adicionar conta./nPosição Ocupada!!");
            }
        }
    }

    public Conta getConta(int x) {
        if (x < capacidade) {
            return conta[x];
        } else {
            System.out.println("Essa conta não existe");
            return null;
        }
    }

    public int getTotalDeContas() {
        return this.conta.length;
    }
}
