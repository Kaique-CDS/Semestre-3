import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Objeto 1: Usando construtor padrão
        System.out.println("=== Cadastro Produto 1 ===");
        Produto prod1 = new Produto();

        System.out.print("Marca: ");
        prod1.setMarca(leia.nextLine());

        System.out.print("Fabricante: ");
        prod1.setFabricante(leia.nextLine());

        System.out.print("Código de Barras: ");
        prod1.setCod_barras(leia.nextLine());

        System.out.print("Preço (ex: 10.50 ou 10,50): ");
        // Lemos como texto, trocamos vírgula por ponto (caso o utilizador digite
        // vírgula) e convertemos para Double
        double preco1 = Double.parseDouble(leia.nextLine().replace(",", "."));
        prod1.setPreco(preco1);

        // Objeto 2: Usando construtor completo (parametrizado)
        System.out.println("\n=== Cadastro Produto 2 ===");
        System.out.print("Marca: ");
        String marca = leia.nextLine();

        System.out.print("Fabricante: ");
        String fabricante = leia.nextLine();

        System.out.print("Código de Barras: ");
        String cod = leia.nextLine();

        System.out.print("Preço (ex: 10.50 ou 10,50): ");
        // Mesma conversão segura para o segundo produto
        double preco2 = Double.parseDouble(leia.nextLine().replace(",", "."));

        // Criando o objeto já passando as variáveis
        Produto prod2 = new Produto(marca, fabricante, cod, preco2);

        // Exibindo os dados
        prod1.exibirDados();
        prod2.exibirDados();

        leia.close();
    }
}