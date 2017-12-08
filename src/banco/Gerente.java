package banco;

/**
 *
 * @author DEV-ITEC
 */
public class Gerente extends Funcionario implements Autenticavel {

    String nome;
    String cpf;
    double salario;
    int senha;
    int numeroDeFuncionariosGerenciados;

    @Override
    public double getBonificacao() {
        return super.getBonificacao() * 0.15 + 1000;
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
}
