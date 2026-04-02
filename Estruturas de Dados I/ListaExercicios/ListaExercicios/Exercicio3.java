package ListaExercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        
        System.out.println("Digite 15 números:");
        for(int i = 0; i < 15; i++) {
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Vetor em ordem decrescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}