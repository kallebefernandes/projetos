package programas;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author kalebe
 */
public class Casa {

    String cor[] = {"Branca", "Preto", "Azul"};
    Porta porta[];
    Porta portas;
    int aberta = 0;
    int totalDePortas;

    public Porta[] getPorta() {
        return porta;
    }

    public void setPorta(Porta[] porta) {
        this.porta = porta;
    }
    
    public void pintaCasa() {
        System.out.println("Porta pintada da cor: \n" + Arrays.toString(this.cor));
    }

    public int quantasPortasAbertas() {
        for (int i = 0; i < this.porta.length; i++) {
            if (this.porta[i] != null) {
                aberta += aberta;
            }
        }
        return aberta;
    }

    public void adicionaPorta(Porta p) {
        for (int i = 0; i < this.porta.length; i++) {
            if (this.porta[i] == null) {
                this.porta[i] = p;
                System.out.println("Porta adicionada.");
            } else {
                System.out.println("Porta ocupada.");
            }
        }
    }

    public int totalDePortas() {
        return (int) porta.length;
    }

    public static void main(String[] args) {
        Casa casa = new Casa();

        casa.quantasPortasAbertas();
    }
}
