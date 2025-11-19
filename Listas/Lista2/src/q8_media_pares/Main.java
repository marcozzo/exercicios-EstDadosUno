package q8_media_pares;

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

        LinkedList<Integer> lista = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            lista.add(num);
        }

        int somaPares = 0;
        int contPares = 0;

        for (Integer num : lista) {
            if (num % 2 == 0) {
                somaPares += num;
                contPares++;
            }
        }

        if (contPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            double mediaPares = (double) somaPares / contPares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
        }
    }
}