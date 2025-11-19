package Q2;

import customImplem.Stack;

public class Main {
    public static void main(String[] args) {
        String result1 = removerDuplicatas("abbaca");
        String result2 = removerDuplicatas("azxxzy");

        System.out.println(result1);
        System.out.println(result2);
    }

    public static String removerDuplicatas(String texto) {
        Stack<Character> inverted = new Stack<>();
        Stack<Character> ordered = new Stack<>();
        String finalString = "";

        for (char charac : texto.toCharArray()) {
            if(inverted.isEmpty()){
                inverted.push(charac);
                continue;
            }

            if (charac == inverted.peek()) {
                inverted.pop();
                continue;
            }

            inverted.push(charac);
        }

        while (!inverted.isEmpty()){
            ordered.push(inverted.pop());
        }
        while (!ordered.isEmpty()){
            finalString += ordered.pop();
        }
        return finalString;
    }
}
