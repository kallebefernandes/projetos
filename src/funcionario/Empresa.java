package funcionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEV-ITEC
 */
public class Empresa {

    private String nome;
    private String cnpj;
    private List<Funcionario> empregados = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados.get(posicao);
    }

    public void adicionaFuncionario(Funcionario f) {
        for (int i = 0; i < empregados.size(); i++) {
            if (empregados.get(i) != null) {
                empregados.set(i, f);
                System.out.println("Funcionário adicionado. ");
            } else {
                System.out.println("Posição ocupada");
            }
        }
    }

    public void mostraFuncionario() {
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println("Funcionário na posição " + i);
        }
    }
}
