package q2_soma_lista;
import java.util.LinkedList;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 15;
        while(n > 10 || n < 1){
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
        }

        LinkedList<Double> numList = new LinkedList<>();

        // POR ALGUM MOTIVO SÓ FUNCIONA COM VÍRGULA
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numList.add(sc.nextDouble());
        }

        String valores = "VALORES = ";

        for (Double currentValue : numList) {
            valores += currentValue + " ";
        }
        System.out.println(valores);

        Double soma = 0d;
        for (Double currentValue : numList) {
            soma += currentValue;
        }
        System.out.println("SOMA = " + soma);
        System.out.println("MÉDIA = " + soma/n);
    }
}
