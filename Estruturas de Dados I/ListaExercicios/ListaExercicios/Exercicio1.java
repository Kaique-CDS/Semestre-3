package ListaExercicios;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = {45, 12, 85, 32, 89};
        
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Vetor ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}