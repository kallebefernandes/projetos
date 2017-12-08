package javaoo1;

import java.util.Scanner;

/**
 *
 * @author kalebe
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }

        int min = 1;
        int max = 1000;
        double somaValor = (min + max) * ((min - max + 1) / 2);
        System.out.println(somaValor);

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        int fatorial = 10;
        int fat = 1;
        for (int i = 2; i <= 10; i++) {
            fat *= i;
        }
        System.out.println("Fatorial de " + fatorial + ": \n" + fat);

        for (int a = 0, b = 1, i = 0; i < 15; i++) {
            b += a;
            a = b - a;
            System.out.print(a + " ");
        }
        System.exit(0);

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = ler.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 != 0) {
                n = 3 * n + 1;
            }
            System.out.println("Número: " + n);
        }
    }
}
