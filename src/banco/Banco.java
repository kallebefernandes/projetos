package banco;

import conta.Conta;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

    private List<Conta> conta;
    private final Map<String, Conta> contas = new HashMap();
    private final int capacidade;

    public Banco(int capacidade) {
        this.capacidade = capacidade;
    }

    public void adicionaConta(Conta c) {
        contas.put(c.getTitular().getNome(), c);
    }

    public Conta getConta(int x) {
        if (x < capacidade) {
            return conta.get(x);
        } else {
            System.out.println("Essa conta não existe");
        }
        return null;
    }

    public int getTotalDeContas() {
        return conta.size();
    }
    
    public Conta buscaPorNome(String nome){
        return contas.get(nome);
        
    }
}
