package banco;

/**
 *
 * @author kalebe
 */
public class Programa {

    public static void main(String[] args) {
        Conta minhaConta = new ContaCorrente();
        Cliente cliente = new Cliente();

        minhaConta.setTitular(cliente);
        minhaConta.setSaldo(1000.0);
        if (minhaConta.saca(100)) {
            System.out.println("Sacado");
        } else {
            System.out.println("Não sacado. Limite atingido");
        }
        minhaConta.deposita(346);

        System.out.println(minhaConta.getSaldo());
    }
}
