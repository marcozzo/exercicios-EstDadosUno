package Q4;

import customImplem.Queue;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] test1 = new int[]{1, 1, 0, 0};
        int[] lanches1 = new int[]{0, 1, 0, 1};

        int[] test2 = new int[]{1, 1, 1, 0, 0, 1};
        int[] lanches2 = new int[]{1, 0, 0, 0, 1, 1};

        System.out.println(contaAlunos(test1, lanches1));
        System.out.println(contaAlunos(test2, lanches2));
    }

    public static int contaAlunos(int[] alunos, int[] lanches) {

        var filaAlunos = new Queue<Integer>();
        var filaLaches = new Queue<Integer>();
        int semLanche = 0;

        for(int aluno: alunos){
            filaAlunos.enqueue(aluno);
        }

        for(int lanche: lanches) {
            filaLaches.enqueue(lanche);
        }

        while (semLanche < filaAlunos.size()){

            if(Objects.equals(filaAlunos.peek(), filaLaches.peek())){
                filaAlunos.dequeue();
                filaLaches.dequeue();
                semLanche = 0;
                continue;
            }

            filaAlunos.enqueue(filaAlunos.dequeue());
            semLanche++;
        }

        return semLanche;
    }
}