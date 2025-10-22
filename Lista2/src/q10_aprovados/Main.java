package q10_aprovados;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 0;
        while(n < 1){
            System.out.print("Quantos alunos serao digitados? ");
            n = sc.nextInt();
        }

        LinkedList<Aluno> lista = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            sc.nextLine();
            String nome = sc.nextLine();

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            lista.add(new Aluno(nome, n1, n2));
        }

        System.out.println("Alunos aprovados:");

        String nomesAprovados = "";

        for (Aluno aluno : lista) {
            if (aluno.getMedia() >= 6.0) {
                nomesAprovados += aluno.getNome() + "\n";
            }
        }

        System.out.println(nomesAprovados);
    }
}