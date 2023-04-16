package aula77;

public class Test {
    public static void main(String[] args) {
        Carro carro = new Carro("HB20");
        Carro carro1 = new Carro();

//        System.out.println(carro);
//        System.out.println(carro.VELOCIDADE_LIMITE);
//        System.out.println(carro1);
//        System.out.println(carro1.VELOCIDADE_LIMITE);

        String teste1 = "SEILAMEO";
        String teste2 = "SeIlAmEo";

        System.out.println(teste1.equals(teste2));
        System.out.println(teste1.equalsIgnoreCase(teste2));

    }
}
