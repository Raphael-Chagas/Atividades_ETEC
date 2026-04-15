import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Exibir Alunos");
            System.out.println("4 - Exibir Professores");
            System.out.println("5 - Editar Aluno");
            System.out.println("6 - Editar Professor");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    Aluno a = new Aluno();

                    System.out.print("Nome: ");
                    a.setNome(scanner.nextLine());

                    System.out.print("Idade: ");
                    a.setIdade(scanner.nextInt());
                    scanner.nextLine();

                    System.out.print("Matrícula: ");
                    a.setMatricula(scanner.nextLine());

                    alunos.add(a);
                    break;

                case 2:
                    Professor p = new Professor();

                    System.out.print("Nome: ");
                    p.setNome(scanner.nextLine());

                    System.out.print("Idade: ");
                    p.setIdade(scanner.nextInt());
                    scanner.nextLine();

                    System.out.print("Disciplina: ");
                    p.setDisciplina(scanner.nextLine());

                    professores.add(p);
                    break;

                case 3:
                    System.out.println("\nAlunos:");
                    for (int i = 0; i < alunos.size(); i++) {
                        Aluno al = alunos.get(i);
                        System.out.println(i + " - " + al.getNome() + ", " + al.getIdade() + ", " + al.getMatricula());
                    }
                    break;

                case 4:
                    System.out.println("\nProfessores:");
                    for (int i = 0; i < professores.size(); i++) {
                        Professor pr = professores.get(i);
                        System.out.println(i + " - " + pr.getNome() + ", " + pr.getIdade() + ", " + pr.getDisciplina());
                    }
                    break;

                case 5:
                    System.out.print("Índice do aluno: ");
                    int iA = scanner.nextInt();
                    scanner.nextLine();

                    if (iA >= 0 && iA < alunos.size()) {
                        Aluno al = alunos.get(iA);

                        System.out.print("Novo nome: ");
                        al.setNome(scanner.nextLine());

                        System.out.print("Nova idade: ");
                        al.setIdade(scanner.nextInt());
                        scanner.nextLine();

                        System.out.print("Nova matrícula: ");
                        al.setMatricula(scanner.nextLine());
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 6:
                    System.out.print("Índice do professor: ");
                    int iP = scanner.nextInt();
                    scanner.nextLine();

                    if (iP >= 0 && iP < professores.size()) {
                        Professor pr = professores.get(iP);

                        System.out.print("Novo nome: ");
                        pr.setNome(scanner.nextLine());

                        System.out.print("Nova idade: ");
                        pr.setIdade(scanner.nextInt());
                        scanner.nextLine();

                        System.out.print("Nova disciplina: ");
                        pr.setDisciplina(scanner.nextLine());
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
