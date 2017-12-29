package sistema;

import conta.Conta;
import conta.ContaCorrente;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DEV-ITEC
 */
public class TesteMapa {

    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(1);
        conta1.deposita(100);
        Conta conta2 = new ContaCorrente(102);
        conta2.deposita(200);

        Map<String, Conta> contas = new HashMap();
        contas.put("conta1", conta1);
        contas.put("conta2", conta2);

        Conta contaDiretor = contas.get("conta1");
        System.out.println(contaDiretor.getSaldo());
    }
}
