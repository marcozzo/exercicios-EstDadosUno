package q3_alturas;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 15;
        while(n > 10 || n < 1){
            System.out.print("Quantas pessoas serão inseridas? ");
            n = sc.nextInt();
        }

        LinkedList<Pessoa> people = new LinkedList<>();

        // POR ALGUM MOTIVO SÓ FUNCIONA COM VÍRGULA
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            Integer age = sc.nextInt();
            System.out.print("Altura: ");
            Double height = sc.nextDouble();

            Pessoa newPerson = new Pessoa(name, age, height);
            people.add(newPerson);
        }

        Double heightSum = 0d;
        for (Pessoa person : people) {
            heightSum += person.getAltura();
        }

        int youngCount = 0;
        LinkedList<String> young = new LinkedList<>();
        for (Pessoa person : people) {
            if(person.getIdade() < 16){
                young.add(person.getNome());
                youngCount++;
            }
        }

        System.out.println("\nAltura média: " + heightSum/n);
        System.out.println("Pessoas com menos de 16 anos: " + youngCount/n);
        for (String person : young) {
            System.out.println(person);
        }
    }
}
