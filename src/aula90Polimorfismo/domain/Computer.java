package aula90Polimorfismo.domain;

public class Computer extends Product {

    private final double COMPUTER_TAX_BASIS = 0.2;
    private String brand;

    public Computer(String nome, double vallue, String brand) {
        super(nome, vallue);
        this.brand = brand;
    }

    public Computer(String nome, double value) {
        super(nome, value);
    }

    @Override
    public double calculateTax() {
        return this.value * (GENERAL_TAX + COMPUTER_TAX_BASIS);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
