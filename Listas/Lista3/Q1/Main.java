package Q1;

import customImplem.Stack;

public class Main {
    public static void main(String[] args) {
        boolean result = validarExpressao("()([]{})");
        boolean result2 = validarExpressao("(){]{}");
        boolean result3 = validarExpressao("(({[()]}{{}}{[]})[])");
        boolean result4 = validarExpressao("(({[(");

        System.out.println("()([]{}) -> " + result);
        System.out.println("(){]{} -> " + result2);
        System.out.println("(({[()]}{{}}{[]})[]) -> " + result3);
        System.out.println("(({[( -> " + result4);
    }

    public static boolean validarExpressao(String texto){
        Stack<Character> chars = new Stack<>();

        for(char charac: texto.toCharArray()){
            if(charac == '(' || charac == '[' || charac == '{'){
                chars.push(charac);
            } else if (charac == ')' || charac == ']' || charac == '}') {
                if(chars.isEmpty())
                    return false;

                switch(charac){
                    case ')':
                        if(chars.pop() != '(')
                            return false;
                        break;
                    case '}':
                        if(chars.pop() != '{')
                            return false;
                        break;
                    case ']':
                        if(chars.pop() != '[')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }

        return chars.isEmpty();
    }
}
