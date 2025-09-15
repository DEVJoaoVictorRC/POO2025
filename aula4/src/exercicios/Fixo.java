package exercicios;

public class Fixo extends Vendedor {
    private double salarioBase;
    private double comissao;
    private double valorVenda;
    
    public Fixo(String nome, String cpf, double salarioBase, double valorVenda, double comissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.valorVenda = valorVenda;
    }
    
    public void calcularSalario() {
        System.out.println("Salário bruto: " + salarioBase);
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double getComissao() {
        return comissao;
    }
    
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public double getValorVenda() {
        return valorVenda;
    }
    
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}