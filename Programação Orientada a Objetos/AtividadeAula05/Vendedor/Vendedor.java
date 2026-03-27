package Vendedor;

public class Vendedor {
    private String nome;
    private double salario;
    private double vendas;
    private int falta;

    public Vendedor(String nome, double salario, double vendas, int falta) {
        this.nome = nome;
        this.salario = salario;
        this.vendas = vendas;
        this.falta = falta;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    public double getVendas() { return vendas; }
    public void setVendas(double vendas) { this.vendas = vendas; }
    public int getFalta() { return falta; }
    public void setFalta(int falta) { this.falta = falta; }

    public double calcularComissao() {
        if (vendas >= 2000.0) {
            return vendas * 0.15; 
        } else if (vendas >= 1000.0) {
            return vendas * 0.10;
        }
        return 0.0;
    }

    public double descontoFalta() {
        return (salario / 30.0) * falta;
    }

    public double calcularSalario() {
        return salario + calcularComissao() - descontoFalta();
    }

    public void imprimirDados() {
        System.out.println("Vendedor: " + nome);
        System.out.println("Salário Base: R$ " + String.format("%.2f", salario));
        System.out.println("Vendas no mês: R$ " + String.format("%.2f", vendas));
        System.out.println("Faltas: " + falta + " (Desconto: R$ " + String.format("%.2f", descontoFalta()) + ")");
        System.out.println("Comissão: R$ " + String.format("%.2f", calcularComissao()));
        System.out.println("Salário Final: R$ " + String.format("%.2f", calcularSalario()));
        System.out.println("---------------------------------");
    }
}