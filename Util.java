public class Util {
    public double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public void exibirResultado(double media) {
        if (media >= 6)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}
