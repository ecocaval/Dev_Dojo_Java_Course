package aula90Polimorfismo.service;

import aula90Polimorfismo.domain.Computer;
import aula90Polimorfismo.domain.Product;

public class TaxCalculator {
    public static void calculateTax(Product product) {
        System.out.println("Tax Report:");

        double tax = product.calculateTax();

        System.out.println("Product: " + product.getNome());
        System.out.println("Value: $" + product.getValue());
        System.out.println("Tax: $" + tax);

        if (product instanceof Computer) {
            Computer computer = (Computer) product;
            if (computer.getBrand() != null) {
                System.out.println("Brand: " + computer.getBrand());
            }
        }
        System.out.println("----------------------");
    }

}
