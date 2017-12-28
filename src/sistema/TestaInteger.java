package sistema;

import conta.Conta;
import conta.ContaCorrente;
import java.io.PrintStream;
import java.util.Objects;

/**
 *
 * @author kalebe
 */
public class TestaInteger {

    public static void main(String[] args) {
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);
        String s = "3";

        if (Objects.equals(x1, x2)) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

        int parseInt = Integer.parseInt(s);
        s = s.replaceAll("!@$$$", s);
        System.out.println(parseInt);
        parseInt = Integer.parseInt(s);
        System.out.println(s);
        
        PrintStream saida = System.out;
        saida.println("oi");
        
        Conta conta = new ContaCorrente(0);
        System.out.println(conta);
    }
}
