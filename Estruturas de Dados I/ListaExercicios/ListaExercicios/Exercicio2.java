package ListaExercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 2, 4, 1};
        int trocas = 0;
        
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    trocas++;
                }
            }
        }
        
        System.out.println("Vetor ordenado. Total de trocas realizadas: " + trocas);
    }
}
