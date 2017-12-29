package sistema;

import banco.ArquivoCliente;
import conta.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author DEV-ITEC
 */
public class TestaImpressao {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome ?");
        String cpf = JOptionPane.showInputDialog("Qual seu cpf ?");
        String sobrenome = JOptionPane.showInputDialog("Qual seu sobrenome ?");
        
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setCpf(cpf);
        c.setSobrenome(sobrenome);
        
        Runnable run = new ArquivoCliente();
        Thread exec = new Thread(run);
        exec.start();
        
    }
}
