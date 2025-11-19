package q6_soma_listas;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 0;
        while(n < 1){
            System.out.print("Quantos valores vai ter cada lista? ");
            n = sc.nextInt();
        }

        LinkedList<Integer> listaA = new LinkedList<>();

        System.out.println("Digite os valores da lista A:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            listaA.add(num);
        }

        LinkedList<Integer> listaB = new LinkedList<>();

        System.out.println("Digite os valores da lista B:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            listaB.add(num);
        }

        LinkedList<Integer> listaC = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int soma = listaA.get(i) + listaB.get(i);
            listaC.add(soma);
        }

        System.out.println("LISTA RESULTANTE:");
        for (Integer num : listaC) {
            System.out.println(num);
        }
    }
}