package sistema;

import conta.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

/**
 *
 * @author kalebe
 */
public class TestaComparacaoConta {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Conta conta = new  ContaPoupanca(2);
        Conta conta1 = new ContaPoupanca(2);

        cliente.setNome("Kalebe");
        cliente.setSobrenome("123");
        
        cliente1.setCpf("adsdadasd");
        
        if (conta.equals(conta1)) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
    }
}
