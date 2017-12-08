package banco;

/**
 *
 * @author DEV-ITEC
 */
public class TestaAtualizador {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        Banco banco = new Banco(3);
        banco.adicionaConta(cc);
        banco.adicionaConta(cp);

        for (int i = 0; i < banco.getTotalDeContas(); i++) {
            System.out.println("Funcionario de numero: " + (i + 1));
            System.out.printf("Saldo: %.2f\n", banco.getConta(i).getSaldo());
            adc.roda(banco.getConta(i));
        }
        System.out.printf("\nSaldo total: %.2f\n", adc.getSaldoTotal());
    }
}
