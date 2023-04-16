package aula84;

import aula84.domain.Desenvolvedor;
import aula84.domain.Funcionario;
import aula84.domain.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Nami Dev", 5000);
        System.out.println(desenvolvedor);
    }
}
