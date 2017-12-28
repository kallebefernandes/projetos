package banco;

import conta.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kalebe
 */
public class ArquivoCliente {
    public void escreveArquivoCliente(Cliente c){
        try {
            OutputStream os = new FileOutputStream("ArquivoCliente.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            try (BufferedWriter bfr = new BufferedWriter(osw)) {
                bfr.write(c.toString());
                bfr.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoCliente.class.getName()).log(Level.SEVERE, "Arquivo não encontrado", ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoCliente.class.getName()).log(Level.SEVERE, "Escrita não feita", ex);
        }
    }
}
