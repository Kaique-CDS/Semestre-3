package atividade1;
public class Paciente {
    // Atributos privados conforme diagrama UML (-)
    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    private String profissao;

    // Construtor 1: Padrão [cite: 838]
    public Paciente() {
        this.nome = "Não informado";
        this.rg = "Não informado";
        this.endereco = "Não informado";
        this.telefone = "Não informado";
        this.dataNascimento = "Não informado";
        this.profissao = "Não informado";
    }

    // Construtor 2: Recebendo apenas o nome [cite: 839]
    public Paciente(String nome) {
        this.nome = nome;
        this.rg = "Não informado";
        this.endereco = "Não informado";
        this.telefone = "Não informado";
        this.dataNascimento = "Não informado";
        this.profissao = "Não informado";
    }

    // Setters para preencher os dados dos objetos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void exibirDados() {
        System.out.println("\n--- Dados do Paciente ---");
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Profissão: " + profissao);
    }
}