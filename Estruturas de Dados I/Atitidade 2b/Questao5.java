import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = {12, 45, 7, 89, 23, 56, 90, 34, 1, 67};

        System.out.print("Digite um número inteiro para realizar a busca: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        System.out.println("\n--- Resultado da Busca ---");
        if (encontrado) {
            System.out.println("O número " + numeroBuscado + " ESTÁ presente no vetor.");
        } else {
            System.out.println("O número " + numeroBuscado + " NÃO está presente no vetor.");
        }

        scanner.close();
    }
}