package banco;

import conta.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kalebe
 */
public class ArquivoCliente implements Runnable {

    Cliente c = new Cliente();

    public void escreveArquivoCliente(Cliente c) {
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

    public void lerArquivo() throws IOException {
        InputStream is = new FileInputStream("ArquivoCliente.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine(); // primeira linha

//        while (linha != null) {
//            System.out.println(linha);
//            linha = br.readLine();
//        }
    }

    public void lerArquivoTeclado() throws IOException {
        InputStream is = new FileInputStream("ArquivoCliente.txt");
        Scanner entrada = new Scanner(is);

        System.out.println("Digite sua mensagem:");
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
    }

    public void gerarArquivoCopia(Cliente c) throws IOException {
        lerArquivo();
        OutputStream os = new FileOutputStream("ArquivoClienteCopia.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        try (BufferedWriter bfr = new BufferedWriter(osw)) {
            bfr.write(c.toString());
            bfr.close();
        }
    }

    @Override
    public void run() {
        try {
            escreveArquivoCliente(c);
            gerarArquivoCopia(c);
        } catch (IOException ex) {
            String message = ex.getMessage();
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
