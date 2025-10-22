package q4_numeros_pares;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 0;
        while(n < 1){
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
        }

        LinkedList<Integer> pares = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if(num % 2 == 0){
                pares.add(num);
            }
        }

        String valores = "NUMEROS PARES:\n ";

        for (Integer thisNum : pares) {
            valores += thisNum + " ";
        }
        System.out.println(valores);

        System.out.println("QUANTIDADE DE PARES = " + pares.size());
    }
}
