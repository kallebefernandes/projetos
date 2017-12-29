package sistema;

import conta.Conta;
import conta.ContaPoupanca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author DEV-ITEC
 */
public class TestaOrdenacao {

    public static void main(String[] args) {
        List<ContaPoupanca> cp = new LinkedList<>();
        Random random = new Random();

        ContaPoupanca cpo = new ContaPoupanca(1);
        cpo.setNumero(1);
        cpo.setSaldo(random.nextInt(1000));
        ContaPoupanca cpo1 = new ContaPoupanca(1);
        cpo1.setNumero(10);
        cpo1.setSaldo(random.nextInt(1000));
        ContaPoupanca cpo3 = new ContaPoupanca(1);
        cpo3.setNumero(100);
        cpo3.setSaldo(random.nextInt(1000));
        ContaPoupanca cpo2 = new ContaPoupanca(1);
        cpo2.setNumero(1000);
        cpo2.setSaldo(random.nextInt(1000));
        ContaPoupanca cpo4 = new ContaPoupanca(1);
        cpo4.setNumero(10000);
        cpo4.setSaldo(random.nextInt(1000));

        cp.add(cpo);
        cp.add(cpo1);
        cp.add(cpo2);
        cp.add(cpo3);
        cp.add(cpo4);

        Collections.sort(cp);
        for (int i = 0; i < cp.size(); i++) {
            Conta atual = cp.get(i);
            System.out.println("numero: " + atual.getNumero() + " " + atual.getSaldo());
        }
        System.out.println("");
        Collections.reverse(cp);
        for (int i = 0; i < cp.size(); i++) {
            Conta atual = cp.get(i);
            System.out.println("numero: " + atual.getNumero());
        }
        System.out.println("");
        Collections.rotate(cp, 4);
        for (int i = 0; i < cp.size(); i++) {
            Conta atual = cp.get(i);
            System.out.println("numero: " + atual.getNumero());
        }
        System.out.println("");
        Collections.shuffle(cp);
        for (int i = 0; i < cp.size(); i++) {
            Conta atual = cp.get(i);
            System.out.println("numero: " + atual.getNumero());
        }
        
        System.out.println(cp);
    }
}
