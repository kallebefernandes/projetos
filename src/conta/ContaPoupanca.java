package conta;

import conta.Conta;

/**
 *
 * @author DEV-ITEC
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void atualiza(double taxa) {
        Cliente cli = new Cliente();
        ContaPoupanca cc = new ContaPoupanca(1, cli);
        cc.setSaldo(getSaldo() * taxa);
    }
}
