package banco;

/**
 *
 * @author DEV-ITEC
 */
public class ContaPoupanca extends Conta {
    
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
        System.out.printf("O saldo é: %.2f", getSaldo());
    }
}
