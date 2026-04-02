package ListaExercicios;

public class Exercicio4 {
    public static void main(String[] args) {
        String[] nomes = {"Carlos", "Ana", "Zeca", "Beatriz", "Daniel"};
        
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - 1 - i; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) > 0) {
                    String temp = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.print(nome + " | ");
        }
    }
}
