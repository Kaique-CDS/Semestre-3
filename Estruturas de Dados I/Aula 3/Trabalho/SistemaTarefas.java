//Kaique Correa da Silva / Matheus henrique villar martins

import java.util.Scanner;

public class SistemaTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetor listaDeTarefas = new Vetor(3); 
        int opcao = -1;

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Tarefas!");

        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas Pendentes");
            System.out.println("3. Concluir/Remover Tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a descrição da tarefa: ");
                        String desc = scanner.nextLine();
                        Tarefa novaTarefa = new Tarefa(desc);
                        listaDeTarefas.adiciona(novaTarefa);
                        System.out.println("✔ Tarefa adicionada com sucesso!");
                        break;

                    case 2:
                        System.out.println("\n--- TAREFAS PENDENTES ---");
                        if (listaDeTarefas.tamanho() == 0) {
                            System.out.println("Nenhuma tarefa pendente. Parabéns!");
                        } else {
                            for (int i = 0; i < listaDeTarefas.tamanho(); i++) {
                                System.out.println(i + " - " + listaDeTarefas.busca(i));
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Digite o número (ID) da tarefa para concluir/remover: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        listaDeTarefas.remove(id);
                        System.out.println("✔ Tarefa removida com sucesso!");
                        break;

                    case 0:
                        System.out.println("Encerrando o sistema... Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número válido para o menu.");
            } catch (Exception e) {
                System.out.println("Erro na operação: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}