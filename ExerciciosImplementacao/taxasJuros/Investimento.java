import java.util.Locale;

public class Investimento implements Comparable<Object>{

    private Long cpf;
    private String tipo;
    private Double taxa;
    private Integer dias;
    private Double capital;
    private static final Double CDI = 4.9/100;
    private final Double IR;

    public Investimento(Long cpf, String tipo, Double taxa, Integer dias, Double capital) {
        this.cpf = cpf;
        this.tipo = tipo;
        this.taxa = taxa / 100;
        this.dias = dias;
        this.capital = capital;

        if(dias <= 180) {
            this.IR = 0.225;
        } else if(dias > 180 && dias <= 360) {
            this.IR = 0.2;
        } else if(dias > 360 && dias <= 720) {
            this.IR = 0.175;
        } else {
            this.IR = 0.15;
        }
    }


    public Long getCpf() {
        return cpf;
    }


    public String getTipo() {
        return tipo;
    }


    public Double getTaxa() {
        return taxa;
    }

    public Integer getDias() {
        return dias;
    }

    public Double getCapital() {
        return capital;
    }

    public Double valBruto() {
        return capital * Math.pow((1 + tx()), dias/360) ; 
    }

    public Double juros() {
        return this.valBruto() - this.capital;
    }

    public Double valLiq() {
        if(tipo.equals("LCI") || tipo.equals("LCA")){
            return this.valBruto();
        }
        return valBruto() - juros() * this.IR;
    }

    public double tx() {
        return this.taxa * CDI;
    }

    public String toString() {
        return String.format(Locale.ENGLISH,
            "%d %s %.2f %d %.2f %.2f %.2f %.2f",
                    getCpf(),
                    getTipo(),
                    getTaxa() * 100,
                    getDias(),
                    getCapital(),
                    valBruto(),
                    juros(),
                    valLiq());
    }

    @Override
    public int compareTo(Object o) {
        Investimento inv = (Investimento) o;
        var este = Math.round(this.valLiq());
        var aquele = Math.round(inv.valLiq());
        return (int)(este - aquele);
    }
}
