package conta;

import javax.swing.JOptionPane;

/**
 *
 * @author DEV-ITEC
 */
public abstract class Conta {

    private int numero;
    private double saldo = 0;
    private double limite;
    private String titular;

    public Conta(int numero) {
        this.numero = numero;
    }

    public Conta() {

    }

    public void saca(double valor) throws SaldoInsuficienteException {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Você sacou: " + valor, "Atenção !!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void deposita(double valor) {
        try {
            this.saldo += valor;
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void transfere(Conta destino, double valor) throws SaldoInsuficienteException {
        saca(valor);
        destino.deposita(valor);
    }

    public abstract void atualiza(double taxa);

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Esta conta de número "+ getNumero() + " tem o saldo de: " + getSaldo() + " Titular: " + getTitular();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
}
