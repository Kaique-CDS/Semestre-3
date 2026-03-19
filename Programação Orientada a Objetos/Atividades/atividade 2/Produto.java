public class Produto {
    // Atributos privados
    private String marca;
    private String fabricante;
    private String cod_barras;
    private double preco;

    // Construtor 1: Padrão
    public Produto() {
        this.marca = "Não informada";
        this.fabricante = "Não informado";
        this.cod_barras = "Não informado";
        this.preco = 0.0;
    }

    // Construtor 2: Com todos os parâmetros
    public Produto(String marca, String fabricante, String cod_barras, double preco) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.cod_barras = cod_barras;
        this.preco = preco;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir
    public void exibirDados() {
        System.out.println("\n--- Dados do Produto ---");
        System.out.println("Marca: " + marca);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cód. Barras: " + cod_barras);
        System.out.println("Preço: R$ " + preco);
    }
}