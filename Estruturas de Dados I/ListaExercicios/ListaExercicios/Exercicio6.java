package ListaExercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 5, 4}; 
        boolean trocou;
        
        for (int i = 0; i < vetor.length - 1; i++) {
            trocou = false;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) {
                System.out.println("Vetor ordenado antecipadamente na passada " + (i + 1));
                break; 
            }
        }
    }
}