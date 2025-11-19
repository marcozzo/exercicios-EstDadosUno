package q9_mais_velho;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 0;
        while(n < 1){
            System.out.print("Quantas pessoas voce vai digitar? ");
            n = sc.nextInt();
        }

        LinkedList<Pessoa> lista = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            lista.add(new Pessoa(nome, idade));
        }

        int maiorIdade = 0;
        String nomeMaisVelho = "";

        for (Pessoa p : lista) {
            if (p.getIdade() > maiorIdade) {
                maiorIdade = p.getIdade();
                nomeMaisVelho = p.getNome();
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
    }
}