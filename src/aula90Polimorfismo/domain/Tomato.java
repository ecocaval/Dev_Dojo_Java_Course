package aula90Polimorfismo.domain;

public class Tomato extends Product{

    private final double TOMATOE_TAX_BASIS = 0.05;

    public Tomato(String nome, double value) {
        super(nome, value);
    }

    @Override
    public double calculateTax() {
        return this.value * (GENERAL_TAX + TOMATOE_TAX_BASIS);
    }
}
