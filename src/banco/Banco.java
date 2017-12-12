package banco;

import conta.Conta;

/**
 *
 * @author DEV-ITEC
 */
public class Banco {

    Conta conta[];
    int capacidade;

    public Banco(int capacidade) {
        this.capacidade = capacidade;
    }

    public void adicionaConta(Conta c) {
        for (int i = 0; i < conta.length; i++) {
            if (conta[i] == null) {
                conta[i] = c;
            } else {
                System.out.println("Posição ocupada");
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
        return (int) conta.length;
    }
}
