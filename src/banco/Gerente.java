package banco;

/**
 *
 * @author DEV-ITEC
 */
public class Gerente extends Funcionario implements Bonificacoes {

    private int nmFuncGerenciados;
    private double bonificacao;
    private boolean recebeAumento;
    private boolean recebeBonificacao;

    @Override
    public double getBonificacao() {
        bonificacao = getSalario() * 0.35;
        recebeBonificacao = true;
        return bonificacao;
    }

    @Override
    public double recebeAumento(double valor) {
        bonificacao = getSalario() + valor;
        recebeAumento = true;
        return bonificacao;
    }

    public double calculaGanhoAnual() {
        double calculaGanhoAnual = 0;
        if (recebeAumento) {
            calculaGanhoAnual = recebeAumento(bonificacao) + getSalario();
        } else if (recebeBonificacao) {
            calculaGanhoAnual = getSalario() + getBonificacao();
        } else if (recebeAumento && recebeBonificacao) {
            calculaGanhoAnual = getSalario() + getBonificacao() + recebeAumento(bonificacao);
        }
        return calculaGanhoAnual;
    }
}
