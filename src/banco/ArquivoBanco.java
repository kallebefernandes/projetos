package banco;

import conta.Conta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DEV-ITEC
 */
public class ArquivoBanco {

    private Conta c;

    public String lerConteudoArquivo(File arquivo) throws IOException {
        StringBuilder retorno = new StringBuilder();
        BufferedReader conteudo = new BufferedReader(new FileReader(arquivo));
        while (conteudo.ready()) {
            retorno.append(conteudo.readLine()).append("\r\n");
        }
        return retorno.toString();
    }

    public void gravaArquivoConta(String nomeArquivo, Conta conta, boolean append) {
        File arquivo = new File(nomeArquivo + ".txt");
        try {
            try (FileWriter grava = new FileWriter(arquivo, append); PrintWriter escreve = new PrintWriter(grava)) {
                escreve.println(conta);
            }
        } catch (IOException ex) {
            System.err.println("Não foi possível escrever no arquivo os dados da conta. " + ex);
        }
    }

    /**
     *
     * @param c
     * @throws IOException
     */
    public void gerarArquivoCopia(Conta c) throws IOException {
        lerConteudoArquivo(new File("Arquivo.txt"));
        gravaArquivoConta("ArquivoContaCópia", c, true);
    }

    @SuppressWarnings("null")
    public void gerarExtrato(File file) {
        try (FileReader arquiv = new FileReader(file)) {
            BufferedReader lerArq = new BufferedReader(arquiv);

            String linha = lerArq.readLine();
            while (linha != null) {
                linha = lerArq.readLine(); // lê da segunda até a última linha
                if (linha.contains(c.getTitular().getNumeroConta())) {
                    gravaArquivoConta("Extrato", c, true);
                } else {
                    System.out.println(" Número da conta não encontrado. ");
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Arquivo não encontrado !!! " + ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
