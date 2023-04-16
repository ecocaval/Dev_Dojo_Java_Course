package aula90Polimorfismo;

import aula90Polimorfismo.domain.Computer;
import aula90Polimorfismo.domain.Tomato;
import aula90Polimorfismo.service.TaxCalculator;

public class Main {

    public static void recursiveTest() {
        recursiveTest();
    }

    public static void main(String[] args) {
        Main.recursiveTest();
//        Computer computer = new Computer("Nitro 5", 2000, "Dell");
//        Computer computer2 = new Computer("Nitro 10", 4000);
//        Tomato tomato = new Tomato("tomate", 20);
//
//        TaxCalculator.calculateTax(computer);
//        TaxCalculator.calculateTax(computer2);
//        TaxCalculator.calculateTax(tomato);

    }
}
