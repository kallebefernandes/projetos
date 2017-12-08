package javaoo1;

/**
 *
 * @author kalebe
 */
public class BalancoTrimestral {

    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaTrimestral = gastosTrimestre / 3;

        System.out.println("Valor Total do Trimestre: " + gastosTrimestre);
        System.out.println("Valor da Média Trimestral: " + mediaTrimestral);
    }
}
