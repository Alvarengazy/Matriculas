import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class App {
    
        

        public record Aluno(String nome, String matricula, double nota) {}
        static int proximoId = 1;
        static Scanner scanner = new Scanner(System.in);
        static ArrayList <Integer> ordemcadastro = new ArrayList<>();
        static HashSet <String> matriculas = new HashSet<>();
        static HashMap <Integer, Aluno> alunos = new HashMap<>();

        
        static void cadastraraluno(){
             System.out.println("Digite o nome do Aluno: "); String nome = scanner.nextLine();
             if (nome.isEmpty()) {System.out.println("O nome não pode estar vazio!!"); return;}

             System.out.println("Otimo, agora qual o numero de matricula do aluno?"); String numeromatricula = scanner.nextLine().trim();
             if (numeromatricula.isEmpty()  || matriculas.contains(numeromatricula)) {System.out.println("Matricula invalida, ou duplicada!!!"); return;}

             System.out.println("Digite a nota do Aluno: "); Double nota = scanner.nextDouble();scanner.nextLine();
             if (nota < 0 || nota > 10) { System.out.println("A nota deve ser maior a zero, ou igual a zero!!!"); return;}

             

            Aluno novoAluno = new Aluno(nome, numeromatricula, nota);
            alunos.put(proximoId, novoAluno);
            matriculas.add(numeromatricula);
            ordemcadastro.add(proximoId); proximoId++;
            System.out.println("Aluno cadastrado com sucesso!");
            }
        
        static void listaraluno(){
            if (alunos.isEmpty()) { System.out.println("Nenhum aluno Cadastrado!!!"); return;}

            for (Integer id : ordemcadastro){ Aluno aluno = alunos.get(id); 
                if (aluno != null) {
                    System.out.println("Matricula: " + aluno.matricula());
                    System.out.println("Aluno:" + aluno.nome());
                    System.out.println("Nota:" + aluno.nota());
                    System.out.println("______________________");
                }
            }
        }

        static void buscaraluno(){
            System.out.println("Digite o numero de matricula do Aluno: ");
            String matriculadigitada = scanner.nextLine().trim();
            
            if (!matriculas.contains(matriculadigitada)) { System.out.println("Aluno não encontrado!!!"); return ;}
                
            for (Integer id : ordemcadastro) { Aluno aluno = alunos.get(id);
            if (aluno.matricula().equals(matriculadigitada)) {
            System.out.println("Aluno encontrado!");
            System.out.println("ID: " + id);
            System.out.println("Nome: " + aluno.nome());
            System.out.println("Matrícula: " + aluno.matricula());
            System.out.println("Nota: " + aluno.nota());
            return; 
                }
                
            }
        }
        static void excluir(){ System.out.println("Digite o numero da matricula do Aluno");
        String matriculadigitada = scanner.nextLine().trim();
        if (!matriculas.contains(matriculadigitada)) { System.out.println("Aluno não encontrado!!!"); return ;}

        for(Integer id : ordemcadastro) { Aluno aluno = alunos.get(id);
          if (aluno.matricula().equals(matriculadigitada)) {
            alunos.remove(id);
            matriculas.remove(matriculadigitada);
            ordemcadastro.remove(matriculadigitada);

            System.out.println("Aluno Excluido do Sistema!!!"); return ;
          }
        }
    }

    public static void main(String[] args) {
    int opcao;

    do {
        System.out.println("\n===== SISTEMA DE ALUNOS =====");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Buscar aluno");
        System.out.println("4 - Excluir aluno");
        System.out.println("0 - Sair");
        System.out.println("=============================");
        System.out.print("Escolha uma opção: ");

        opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1 -> cadastraraluno();
            case 2 -> listaraluno();
            case 3 -> buscaraluno();
            case 4 -> excluir();
            case 0 -> System.out.println("Encerrando o sistema...");
            default -> System.out.println("Opção inválida!");
        }

    } while (opcao != 0);
}
} 


