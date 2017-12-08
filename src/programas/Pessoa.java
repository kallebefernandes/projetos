package programas;

/**
 *
 * @author kalebe
 */
public class Pessoa {

    String nome;
    int idade;

    public void fazAniversario() {
        this.idade += 1;
        System.out.println(idade);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "Kalebe";
        p.idade = 23;

        p.fazAniversario();

    }
}
