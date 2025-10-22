package q7;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 0;
        while(n < 1){
            System.out.print("Quantos elementos vai ter a lista? ");
            n = sc.nextInt();
        }

        LinkedList<Double> lista = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            lista.add(num);
        }

        double soma = 0.0;
        for (Double num : lista) {
            soma += num;
        }

        double media = soma / n;

        System.out.println("MEDIA DA LISTA = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (Double num : lista) {
            if (num < media) {
                System.out.print("\n" + num);
            }
        }
    }
}