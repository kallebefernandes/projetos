package sistema;

import conta.Conta;
import conta.ContaPoupanca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DEV-ITEC
 */
public class TestaOrdenacao {

    public static void main(String[] args) {
        List<ContaPoupanca> cp = new LinkedList<>();

        ContaPoupanca cpo = new ContaPoupanca(1);
        cpo.setNumero(1);
        ContaPoupanca cpo1 = new ContaPoupanca(1);
        cpo1.setNumero(10);
        ContaPoupanca cpo3 = new ContaPoupanca(1);
        cpo3.setNumero(100);
        ContaPoupanca cpo2 = new ContaPoupanca(1);
        cpo2.setNumero(1000);
        ContaPoupanca cpo4 = new ContaPoupanca(1);
        cpo4.setNumero(10000);

        cp.add(cpo);
        cp.add(cpo1);
        cp.add(cpo2);
        cp.add(cpo3);
        cp.add(cpo4);

        Collections.sort(cp);
        for (int i = 0; i < cp.size(); i++) {
            Conta atual = cp.get(i);
            System.out.println("numero: " + atual.getNumero());
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
    }
}
