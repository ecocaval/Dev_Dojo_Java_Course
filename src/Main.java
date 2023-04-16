import aula80.TipoPagamento;

public class Main {
    public static void main(String[] args) {
        System.out.println(TipoPagamento.DEBITO.calcularDescontoProduto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDescontoProduto(100));
    }
}