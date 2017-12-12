package conta;

/**
 *
 * @author DEV-ITEC
 */
public class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException(double valor) {
        super("Valor inválido " + valor);
    }

}
