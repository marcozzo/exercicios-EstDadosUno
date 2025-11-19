
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("files/entradaInvest.txt"));
        PrintWriter pw = new PrintWriter("files/saidaInvest.txt");
        List<Investimento> investments = new ArrayList<>();
            
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] campos = linha.split(" ");

            Long cpf = Long.parseLong(campos[0]);
            String tipo = campos[1];
            Double taxa = Double.parseDouble(campos[2]);
            Integer dias = Integer.parseInt(campos[3]);
            Double capital = Double.parseDouble(campos[4]);

            investments.add(new Investimento(cpf, tipo, taxa, dias, capital));
        }
        Collections.sort(investments, Collections.reverseOrder());

        for(Investimento inv: investments){
            pw.println(inv);
        }

        sc.close();
        pw.close();
    }
}
