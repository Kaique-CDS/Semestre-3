package ListaExercicios;

public class Exercicio8 {
    public static void main(String[] args) {
        double[] notas = {7.5, 4.0, 9.8, 6.5, 8.0};
        int trocas = 0;
        double soma = 0;
        
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    double temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                    trocas++;
                }
            }
        }
        
        for(double nota : notas) {
            soma += nota;
        }
        
        System.out.println("Notas ordenadas: ");
        for(double n : notas) System.out.print(n + " | ");
        
        System.out.println("\nMédia da turma: " + (soma / notas.length));
        System.out.println("Quantidade de trocas na ordenação: " + trocas);
    }
}