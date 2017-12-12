package funcionario;

/**
 *
 * @author DEV-ITEC
 */
public class Empresa {

    private String nome;
    private String cnpj;
    private final Funcionario empregados[];

    public Empresa(String nome, Funcionario empregados[], String cnpj) {
        this.empregados = empregados;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }

    public void adicionaFuncionario(Funcionario f) {
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] != null) {
                empregados[i] = f;
                System.out.println("Funcionário adicionado. ");
            } else {
                System.out.println("Posição ocupada");
            }
        }
    }

    public void mostraFuncionario() {
        for (int i = 0; i < empregados.length; i++) {
            System.out.println("Funcionário na posição " + i);
        }
    }
}
