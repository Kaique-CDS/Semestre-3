// Kaique Correa da Silva
// RG 57.245.904-X
// RGM 42424798

public class main {
    public static void main(String[] args) {
        
        // 1. Instanciando os objetos
        cliente cliente1 = new cliente();
        curso curso1 = new curso();
        
        // 2. Atribuindo valores aos atributos do Cliente
        cliente1.nome = "João da Silva";
        cliente1.cpf = "123.456.789-00";
        cliente1.email = "joao.silva@email.com";
        cliente1.telefone = "(11) 98765-4321";
        cliente1.endereco = "Rua das Flores, 123";
        
        // Atribuindo valores aos atributos do Curso
        curso1.nomeCurso = "Análise e Desenvolvimento de Software";
        curso1.codigoCurso = 2054;
        curso1.cargaHoraria = 2000;
        curso1.modalidade = "Presencial";
        
        // 3. Mostrando os valores na tela
        System.out.println("--- DADOS DO CLIENTE ---");
        System.out.println("Nome: " + cliente1.nome);
        System.out.println("CPF: " + cliente1.cpf);
        System.out.println("E-mail: " + cliente1.email);
        System.out.println("Telefone: " + cliente1.telefone);
        System.out.println("Endereço: " + cliente1.endereco);
        
        System.out.println("\n--- DADOS DO CURSO ---");
        System.out.println("Código: " + curso1.codigoCurso);
        System.out.println("Nome do Curso: " + curso1.nomeCurso);
        System.out.println("Carga Horária: " + curso1.cargaHoraria + " horas");
        System.out.println("Modalidade: " + curso1.modalidade);
    }
}