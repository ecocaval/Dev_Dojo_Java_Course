package aula90Polimorfismo.domain;

public class Computer extends Product {

    private final double COMPUTER_TAX_BASIS = 0.2;

    public Computer(String nome, double value) {
        super(nome, value);
        System.out.println(" R$"+calculateTax());
    }

    @Override
    public double calculateTax() {
        System.out.print("Calculando imposto do " + this.nome);
        return this.value * (GENERAL_TAX + COMPUTER_TAX_BASIS);
    }
}
