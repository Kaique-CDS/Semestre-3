package ListaExercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        int[] vetor = {50, 20, 40, 10, 30};
        
        for (int j = 0; j < vetor.length - 1; j++) {
            if (vetor[j] > vetor[j + 1]) {
                int temp = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = temp;
            }
        }
        
        System.out.println("Vetor após apenas 1 passada:");
        for(int num : vetor) System.out.print(num + " ");
    }
}