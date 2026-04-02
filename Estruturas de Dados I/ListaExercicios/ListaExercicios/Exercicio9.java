package ListaExercicios;

public class Exercicio9 {
    public static void main(String[] args) {
        int[] ordenado = {1, 2, 3, 4, 5};
        int[] inverso = {5, 4, 3, 2, 1};
        
        System.out.println("Trocas no vetor já ordenado: " + contarTrocas(ordenado));
        System.out.println("Trocas no vetor inverso: " + contarTrocas(inverso));
    }
    
    public static int contarTrocas(int[] vetor) {
        int trocas = 0;
        boolean trocou;
        for (int i = 0; i < vetor.length - 1; i++) {
            trocou = false;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
        return trocas;
    }
}