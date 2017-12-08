package banco;

import java.util.Date;

/**
 *
 * @author kalebe
 */
public class Funcionario {

    private String nome;
    private String departamento;
    private Date dataAdmissao;
    private Date dataDemissao;
    private int rg;
    private double salario;
    private boolean estaNaEmpresa = true;
    int senha;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario() {

    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public void mostraFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de admissão: " + this.dataAdmissao);
        System.out.println("Data d demissão: " + this.dataDemissao);
        System.out.println("RG: " + this.rg);
        System.out.println("Salário: " + this.salario);
        System.out.println("Está na Empresa? " + this.estaNaEmpresa);
    }

    public void recebeAumento(double valor) {
        this.salario += valor;
    }

    public double calculaGanhoAnual() {
        return salario * 12;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    public boolean ativo() {
        if (getDataDemissao().equals(0)) {
            estaNaEmpresa = true;
        } else {
            estaNaEmpresa = false;
        }
        return estaNaEmpresa;
    }

    public void demiteFuncionario() {
        setDataDemissao(dataDemissao);
        estaNaEmpresa = false;
    }
}
