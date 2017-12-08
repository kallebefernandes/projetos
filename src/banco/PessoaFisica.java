package banco;

/**
 *
 * @author DEV-ITEC
 */
public class PessoaFisica {
    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }
    
    public void validaCPF(String x){
        if (!cpf.isEmpty()) {
            System.out.println("CPF Válido.");
        } else {
            System.out.println("CPF Nulo.");
        }
    }
}
