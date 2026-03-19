public class Vetor {
    private String[] elementos;
    private int tamanho;

    // Construtor
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Método para adicionar ao final do vetor
    public boolean adiciona(String elemento) throws Exception {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        throw new Exception("Vetor já está cheio");
    }

    //Adicionar em qualquer posição
    public boolean adiciona(int posicao, String elemento) throws Exception {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new Exception("Posição Inválida");
        }
        
        this.aumentaCapacidade();
        
        // Move os elementos para a direita para abrir espaço
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    // Método para remover um elemento
    public void remove(int posicao) throws Exception {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new Exception("Posição Inválida");
        }
        // Move os elementos para a esquerda para cobrir o buraco
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    // Busca por posição
    public String busca(int posicao) throws Exception {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new Exception("Posição Inválida");
        }
        return this.elementos[posicao];
    }

    // Busca por elemento (retorna o índice)
    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1; // Elemento não encontrado
    }

    // Verifica o tamanho atual
    public int tamanho() {
        return this.tamanho;
    }

    // Aumenta a capacidade do array dinamicamente
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    // Retorna a representação do vetor em String
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }
}