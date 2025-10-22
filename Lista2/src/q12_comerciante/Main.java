package q12_comerciante;

import q3_alturas.Pessoa;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = 0;
        while(n < 1){
            System.out.print("Serão digitados dados de quantos produtos? ");
            n = sc.nextInt();
        }

        LinkedList<Produto> produtos = new LinkedList<>();

        double totalCompra = 0d;
        double totalVenda = 0d;

        for (int i = 0; i < n; i++) {
            System.out.println("Produto n°" + (i + 1) + ":");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Preco de compra: ");
            Double compra = sc.nextDouble();
            System.out.print("Preco de venda: ");
            Double venda = sc.nextDouble();

            Produto newProduto = new Produto(name, compra, venda);
            produtos.add(newProduto);
            totalCompra += compra;
            totalVenda += venda;
        }

        int abaixoDe10 = 0;
        int entre10E20 = 0;
        int acimaDe20 = 0;
        
        for (Produto p : produtos) {
            double percenLucro = p.getLucro()/p.getPrecoCompra();
            percenLucro *= 100;
            System.out.println(p.getNome() + ": " + percenLucro+"%");

            if(percenLucro < 10)
                abaixoDe10++;
            else if(percenLucro >= 10 && percenLucro <= 20)
                entre10E20++;
            else
                acimaDe20++;
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("RELATÓRIO:");
        System.out.println("Lucro abaixo de 10%: " + abaixoDe10);
        System.out.println("Lucro entre 10% e 20%: " + entre10E20);
        System.out.println("Lucro acima de 20%: " + acimaDe20);

        System.out.println("Valor total de compra: R$" + totalCompra);
        System.out.println("Valor total de venda: R$" + totalVenda);
        System.out.println("Lucro total: R$" + lucroTotal);
    }
}