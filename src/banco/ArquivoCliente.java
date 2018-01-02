package banco;

import conta.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kalebe
 */
public class ArquivoCliente implements Runnable {

    Cliente c;

    public ArquivoCliente(Cliente c) {
        this.c = c;
    }

    public String lerConteudoArquivo(File arquivo) throws IOException {
        StringBuilder retorno = new StringBuilder();
        BufferedReader conteudo = new BufferedReader(new FileReader(arquivo));
        while (conteudo.ready()) {
            retorno.append(conteudo.readLine()).append("\r\n");
        }
        return retorno.toString();
    }

    public void gravaArquivoCliente(String nomeArquivo, Cliente conteudo, boolean append) {
        File arquivo = new File(nomeArquivo + ".txt");
        try {
            try (FileWriter grava = new FileWriter(arquivo, append); PrintWriter escreve = new PrintWriter(grava)) {
                escreve.println(conteudo);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArquivoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gerarArquivoCopia(Cliente c) throws IOException {
        lerConteudoArquivo(new File("Arquivo.txt"));
        gravaArquivoCliente("ArquivoClienteCópia", c, true);
    }

    @Override
    public void run() {
        try {
            gravaArquivoCliente("Arquivo", c, true);
            gerarArquivoCopia(c);
        } catch (IOException ex) {
            String message = ex.getMessage();
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
