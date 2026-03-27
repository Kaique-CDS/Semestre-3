package Triangulo;

public class MainTriangulo {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10.0, 5.0);
        t1.imprimeDados();
        
        System.out.println("\nAlterando valores com Setters...");
        t1.setBase(8.0);
        t1.setAltura(4.0);
        t1.imprimeDados();
    }
}