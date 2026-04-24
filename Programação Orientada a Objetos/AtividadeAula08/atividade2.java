import java.util.Scanner;

class Empregado {
    protected String nome;
    protected String matricula;

    public Empregado() {
    }

    public Empregado(String n, String m) {
        this.nome = n;
        this.matricula = m;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public float calculaSalario() {
        return 0f;
    }
}

class Analista extends Empregado {
    private float[] valorPorProjeto;

    public Analista() {
    }

    public Analista(String n, String m, float[] vP) {
        super(n, m);
        this.valorPorProjeto = vP;
    }

    public float[] getValorPorProjeto() { return valorPorProjeto; }
    public void setValorPorProjeto(float[] valorPorProjeto) { this.valorPorProjeto = valorPorProjeto; }

    @Override
    public float calculaSalario() {
        float total = 0f;
        if (valorPorProjeto != null) {
            for (float valor : valorPorProjeto) {
                total += valor;
            }
        }
        return total;
    }
}

class Programador extends Empregado {
    private float qtdeHoras;
    private float valorHora;

    public Programador() {
    }

    public Programador(String n, String m, float qH, float vH) {
        super(n, m);
        this.qtdeHoras = qH;
        this.valorHora = vH;
    }

    public float getQtdeHoras() { return qtdeHoras; }
    public void setQtdeHoras(float qtdeHoras) { this.qtdeHoras = qtdeHoras; }
    public float getValorHora() { return valorHora; }
    public void setValorHora(float valorHora) { this.valorHora = valorHora; }

    @Override
    public float calculaSalario() {
        return valorHora * qtdeHoras;
    }
}

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Dados do Analista ---");
        System.out.print("Nome: ");
        String nomeAnalista = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matAnalista = scanner.nextLine();
        
        System.out.print("Quantidade de projetos: ");
        int qtdProjetos = scanner.nextInt();
        float[] projetos = new float[qtdProjetos];
        for (int i = 0; i < qtdProjetos; i++) {
            System.out.print("Valor do projeto " + (i + 1) + ": ");
            projetos[i] = scanner.nextFloat();
        }
        scanner.nextLine(); 

        Analista analista = new Analista(nomeAnalista, matAnalista, projetos);

        System.out.println("\n--- Dados do Programador ---");
        System.out.print("Nome: ");
        String nomeProg = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matProg = scanner.nextLine();
        
        System.out.print("Quantidade de horas trabalhadas: ");
        float qtdeHoras = scanner.nextFloat();
        System.out.print("Valor da hora: ");
        float valorHora = scanner.nextFloat();

        Programador programador = new Programador(nomeProg, matProg, qtdeHoras, valorHora);

        System.out.println("\n--- Salários Calculados ---");
        System.out.println("Analista: " + analista.getNome() + " | Matrícula: " + analista.getMatricula() + " | Salário: R$ " + analista.calculaSalario());
        System.out.println("Programador: " + programador.getNome() + " | Matrícula: " + programador.getMatricula() + " | Salário: R$ " + programador.calculaSalario());

        scanner.close();
    }
}