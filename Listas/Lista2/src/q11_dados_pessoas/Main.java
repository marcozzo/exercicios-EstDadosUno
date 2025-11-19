package q11_dados_pessoas;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 0;
        while(n < 1){
            System.out.print("Quantas pessoas serao digitadas? ");
            n = sc.nextInt();
        }

        LinkedList<Pessoa> lista = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double altura = sc.nextDouble();

            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            char genero = sc.next().toUpperCase().charAt(0);

            lista.add(new Pessoa(altura, genero));
        }

        double menorAltura = lista.get(0).getAltura();
        double maiorAltura = lista.get(0).getAltura();
        double somaAlturasMulheres = 0.0;
        int numMulheres = 0;
        int numHomens = 0;

        for (Pessoa p : lista) {
            if (p.getAltura() < menorAltura) {
                menorAltura = p.getAltura();
            }
            if (p.getAltura() > maiorAltura) {
                maiorAltura = p.getAltura();
            }

            if (p.getGenero() == 'F') {
                somaAlturasMulheres += p.getAltura();
                numMulheres++;
            }
            else if (p.getGenero() == 'M') {
                numHomens++;
            }
        }

        double mediaAlturaMulheres = 0.0;
        if (numMulheres > 0) {
            mediaAlturaMulheres = somaAlturasMulheres / numMulheres;
        }

        System.out.print("Menor altura = ");
        System.out.println(menorAltura);
        System.out.print("Maior altura = ");
        System.out.println(maiorAltura);
        System.out.print("Media das alturas das mulheres = ");
        System.out.println(mediaAlturaMulheres);
        System.out.print("Numero de homens = ");
        System.out.println(numHomens);
    }
}