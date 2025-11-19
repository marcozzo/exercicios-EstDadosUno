package q12_comerciante;

public class Produto {
    private String nome;
    private double precoCompra;
    private double precoVenda;
    private double lucro;

    public Produto(String nome, double precoCompra, double precoVenda) {
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.lucro = precoVenda - precoCompra;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public double getLucro() {
        return lucro;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
}