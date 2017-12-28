package sistema;

import banco.ArquivoCliente;
import conta.Cliente;

/**
 *
 * @author kalebe
 */
public class TestaIO {
    public static void main(String[] args) {
        ArquivoCliente aqc = new ArquivoCliente();
        Cliente c = new Cliente();
        
        c.setCpf("1");
        c.setNome("k");
        c.setSobrenome("l");
        aqc.escreveArquivoCliente(c);
    }
}
