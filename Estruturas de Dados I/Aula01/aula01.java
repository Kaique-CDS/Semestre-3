import java.util.Scanner;
public class aula01 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 int qtdeAlunos, contador;
 int reprovados = 0;
 
 double nota, totalNotas, media;
 
 qtdeAlunos = 0; 
 contador = 1;
 nota = totalNotas = media = 0;
 
 System.out.println("Seja bem vindo ao calculador de notas!!!");
 System.out.println("=========================================");
 System.out.println("Digite a quantidade de alunos da turma:");
 
 qtdeAlunos = sc.nextInt();
 
 while (contador <= qtdeAlunos) {
 System.out.println("Digite a nota do aluno " + contador + ":");
 nota = sc.nextDouble();
 
 if (nota >= 6) {
 System.out.println("O aluno foi aprovado!");
 } else {
 System.out.println("O aluno está reprovado!");
 reprovados++;
 }
 
 totalNotas += nota;
 contador++;
 }
 
 media = totalNotas / qtdeAlunos;
 
 System.out.println("=================================");
 System.out.println("Média da turma: " + media);
 System.out.println("Total de alunos reprovados: " + reprovados);
 }
}