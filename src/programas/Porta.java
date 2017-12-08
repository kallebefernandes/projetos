package programas;

import java.util.Arrays;

/**
 *
 * @author kalebe
 */
public class Porta {

    int aberta;
    String cor[] = {"Branca", "Preto", "Azul"};
    boolean estaAberta = false;

    public String[] getCor() {
        return cor;
    }

    public void setCor(String[] cor) {
        this.cor = cor;
    }

    public boolean isEstaAberta() {
        return estaAberta;
    }

    public void setEstaAberta(boolean estaAberta) {
        this.estaAberta = estaAberta;
    }

    public int getAberta() {
        aberta = 1;
        System.out.println("Aberta ");
        return aberta;
    }

    public void fecha() {
        aberta = 0;
        System.out.println("Fechada ");
    }

    public boolean estaAberta() {
        if (aberta == 1) {
            estaAberta = true;
        } else {
            estaAberta = false;
        }
        System.out.println(estaAberta);
        return estaAberta;
    }

    public void pintaPorta() {
        System.out.println("Porta pintada da cor: \n" + Arrays.toString(this.cor));
    }
    
    public static void main(String[] args) {
        Porta p = new Porta();
        
        p.getAberta();
        p.fecha();
        p.estaAberta();
        p.pintaPorta();
    }
}
