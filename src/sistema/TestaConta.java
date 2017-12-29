package sistema;

import conta.Conta;
import conta.ContaCorrente;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DEV-ITEC
 */
public class TestaConta {

    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();
        Conta c = new ContaCorrente(0);
        c.setNumero(0);
        c.setSaldo(123);
        Conta c1 = new ContaCorrente(1);
        c1.setNumero(0);
        c1.setSaldo(123);

        contas.add(c);
        contas.add(c1);

        System.out.println(contas.size() + " " + contas);
    }
}
