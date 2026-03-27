package Vendedor;

public class MainVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Garro", 3000.0, 2500.0, 0);
        Vendedor v2 = new Vendedor("Yuri", 3000.0, 1500.0, 2);
        Vendedor v3 = new Vendedor("Memphis", 3000.0, 500.0, 1);

        v1.imprimirDados();
        v2.imprimirDados();
        v3.imprimirDados();
    }
}