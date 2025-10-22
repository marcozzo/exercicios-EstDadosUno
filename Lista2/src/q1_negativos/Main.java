package q1_negativos;
import listImpl.MyList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = 15;
        while(length > 10 || length < 1){
            System.out.print("Quantos números você vai digitar? ");
            length = sc.nextInt();
        }

        // Testando com implementação própria de listas
        MyList<Integer> numList = new MyList<>();

        for (int i = 0; i < length; i++) {
            System.out.print("Digite um número: ");
            numList.addAtEnd(sc.nextInt());
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < numList.getSize(); i++) {
            Integer currentValue = numList.getNode(i).getValue();

            if( currentValue < 0){
                System.out.println(currentValue);
            }
        }
    }
}
