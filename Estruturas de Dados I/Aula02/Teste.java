public class Teste {
    public static void main(String[] args) {
        try {
            // Instanciando o vetor com capacidade inicial de 5
            Vetor vetor = new Vetor(5);

            // 1. Testando Adicionar Elementos
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");
            vetor.adiciona("Elemento 4");
            System.out.println("Vetor: " + vetor.toString());
            System.out.println("Tamanho atual: " + vetor.tamanho());

            // 4. Testando Remover
        
            vetor.remove(0);
            System.out.println("Vetor: " + vetor.toString());
            System.out.println("Tamanho atual: " + vetor.tamanho());
            

        } catch (Exception e) {
            System.out.println("Erro durante a execução: " + e.getMessage());
        }
    }
}