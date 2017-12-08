package banco;

/**
 *
 * @author DEV-ITEC
 */
public class Empresa {

    private String nome;
    private String cnpj;
    Funcionario[] empregados;

    public Empresa(Funcionario[] empregados) {
        this.empregados = empregados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }

    public void adicionaFuncionario(Funcionario f) {
        for (int i = 0; i < this.empregados.length; i++) {
            if (this.empregados[i] == null) {
                this.empregados[i] = f;
                System.out.println("Funcionário adicionado.");
            } else {
                System.out.println("Posição ocupada.");
            }
        }
    }

    public void mostraFuncionarios() {
        for (Funcionario empregado : this.empregados) {
            empregado.mostraFuncionario();
        }
    }
}
