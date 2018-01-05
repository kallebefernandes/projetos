package funcionario;

import interfaces.Autenticavel;
import java.util.Date;

/**
 *
 * @author DEV-ITEC
 */
public class Funcionario implements Autenticavel {

    private String nome;
    private String departamento;
    private Date dtAdmissao;
    private Date dtDemissao;
    private int rg;
    private int senha;
    private double salario;
    private boolean estaNaEmpresa;
    private boolean recebeAumento;

    public Funcionario() {
        estaNaEmpresa = true;
    }

    @Override
    public String toString() {
        return "Informações do Funcionário " + "Nome: " + nome + " Departamento: " + departamento
                + " Data de Admissão: " + dtAdmissao + " RG: " + rg;
    }

    public boolean ativo(Funcionario f) {
        if (f.getDtAdmissao() != null && f.getDtDemissao() == null) {
            f.setEstaNaEmpresa(true);
            System.out.println("Funcionário está ativo na Empresa ");
            return true;
        } else {
            System.out.println("Funcionário não está ativo na Empresa ");
            return false;
        }
    }

    public boolean demite() {
        Funcionario f = new Funcionario();
        if (f.getDtAdmissao() != null) {
            f.setDtDemissao(dtDemissao);
            f.setEstaNaEmpresa(false);
            System.out.println("Funcionário está demitido da Empresa ");
            return true;
        } else {
            f.setEstaNaEmpresa(false);
            return false;
        }
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if (getSenha() == this.senha) {
            System.out.println("Autenticação completada.\n Logado !!");
            return true;
        } else {
            System.out.println("Senha incorreta.\n Insira uma senha válida.");
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public Date getDtDemissao() {
        return dtDemissao;
    }

    public int getSenha() {
        return senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    private void setDtDemissao(Date dtDemissao) {
        this.dtDemissao = dtDemissao;
    }

}
