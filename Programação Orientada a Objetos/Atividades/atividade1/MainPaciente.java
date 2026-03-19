package atividade1;
import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("=== Cadastro Paciente 1 ===");
        Paciente p1 = new Paciente();

        System.out.print("Nome: ");
        p1.setNome(leia.nextLine());
        System.out.print("RG: ");
        p1.setRg(leia.nextLine());
        System.out.print("Profissão: ");
        p1.setProfissao(leia.nextLine());

        System.out.println("\n=== Cadastro Paciente 2 ===");
        System.out.print("Digite o nome do paciente 2 para iniciar o cadastro: ");
        String nomeP2 = leia.nextLine();

        Paciente p2 = new Paciente(nomeP2);
        System.out.print("RG: ");
        p2.setRg(leia.nextLine());
        System.out.print("Endereço: ");
        p2.setEndereco(leia.nextLine());

        p1.exibirDados();
        p2.exibirDados();

        leia.close();
    }
}