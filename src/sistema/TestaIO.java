package sistema;

import banco.ArquivoCliente;
import conta.Cliente;
import java.io.IOException;

/**
 *
 * @author kalebe
 */
public class TestaIO {
    public static void main(String[] args) throws IOException {
        Cliente c = new Cliente();
        
        c.setCpf("1");
        c.setNome("ksdfs");
        c.setSobrenome("l545");
        ArquivoCliente aqc = new ArquivoCliente(c);
        aqc.gravaArquivoCliente("Arquivo", c, true);
//        aqc.lerArquivo();
//        aqc.gerarArquivoCopia(c);
    }
}
