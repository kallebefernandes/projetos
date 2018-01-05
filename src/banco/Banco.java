package banco;

import conta.Conta;
import java.util.HashMap;
import java.util.Map;

public class Banco {

    private final Map<String, Conta> contas = new HashMap();

    public Banco() {
    }

    public void adicionaConta(Conta c) {
        contas.put(c.getTitular(), c);
    }

    @SuppressWarnings("element-type-mismatch")
    public Conta getConta(int x) {
        return contas.get(x);
    }

    public int getTotalDeContas() {
        return contas.size();
    }

    public Conta buscaPorNome(String nome) {
        return contas.get(nome);

    }
}
