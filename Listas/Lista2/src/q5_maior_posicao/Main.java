package q5_maior_posicao;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 0;
        while(n < 1){
            System.out.print("Quantos numeros voce vai digitar? ");
            n = sc.nextInt();
        }

        LinkedList<Double> lista = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            lista.add(num);
        }

        double maiorValor = lista.get(0);
        int posicao = 0;

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > maiorValor) {
                maiorValor = lista.get(i);
                posicao = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
    }
}