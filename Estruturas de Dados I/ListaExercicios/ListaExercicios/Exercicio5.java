package ListaExercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] vetor = {74, 12, 8, 99, 32};
        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Menor valor: " + vetor[0]);
        System.out.println("Maior valor: " + vetor[vetor.length - 1]);
    }
}