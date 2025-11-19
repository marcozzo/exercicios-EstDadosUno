package Q3;

import customImplem.Queue;

public class Main {
    public static void main(String[] args) {
        int[] test1 = new int[]{1, 1};
        int[] test2 = new int[]{2, 3, 2};
        int[] test3 = new int[]{5, 1, 1, 1};

        System.out.println(tempoDeCompra(test1, 1));
        System.out.println(tempoDeCompra(test2, 2));
        System.out.println(tempoDeCompra(test3, 0));
    }

    public static int tempoDeCompra(int[] ingressos, int k) {

        var compradores = new Queue<Integer>();
        int tempoTotal = 0;

        for(int ingresso: ingressos){
            compradores.enqueue(ingresso);
        }

        int faltando = ingressos[k];

        while (faltando > 0){

            if(k == 0){
                faltando--;
                tempoTotal++;
                compradores.enqueue(compradores.dequeue());

                //pessoa k vai para o final da fila
                k = compradores.size() - 1;
                continue;
            }

            Integer firstInLine = compradores.dequeue();
            if(firstInLine > 1){
                compradores.enqueue(firstInLine - 1);
            }

            tempoTotal++;
            k--;
        }

        return tempoTotal;
    }
}