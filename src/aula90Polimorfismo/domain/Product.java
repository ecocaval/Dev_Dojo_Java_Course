package aula90Polimorfismo.domain;

public abstract class Product implements Taxable {

    public static final double GENERAL_TAX = 0.3;

    protected String nome;
    protected double value;

    public Product(String nome, double vallue) {
        this.nome = nome;
        this.value = vallue;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
