package sistema;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DEV-ITEC
 */
public class TestaPerfomance {

    public static void main(String[] args) {
//        System.out.println("Iniciando...");
//        Collection<Integer> teste = new HashSet<>();
//        long inicio = System.currentTimeMillis();
//        int total = 30000;
//
//        for (int i = 0; i < total; i++) {
//            teste.add(i);
//        }
//        for (int i = 0; i < total; i++) {
//            teste.contains(i);
//        }
//
//        long fim = System.currentTimeMillis();
//        System.out.println("Terminando...");
//        long tempo = fim - inicio;
//        System.out.println("Tempo gasto: " + tempo);

        System.out.println("Iniciando...");
        List<Integer> teste = new LinkedList<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;

        for (int i = 0; i < total; i++) {
            teste.add(0, i);
        }
        for (int i = 0; i < total; i++) {
            teste.get(i);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Terminando...");
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
}
