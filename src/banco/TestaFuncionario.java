package banco;
/**
 *
 * @author kalebe
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario[] empregados = new Funcionario[10];
        Empresa empresa = new Empresa(empregados);
        empresa.empregados = new Funcionario[10];
        
       
        empresa.mostraFuncionarios();
    }
}
