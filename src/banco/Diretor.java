package banco;

/**
 *
 * @author DEV-ITEC
 */
public class Diretor extends Funcionario implements Autenticavel {

    @Override
    public boolean autenticaSenha(int senha) {
        if (super.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
}
