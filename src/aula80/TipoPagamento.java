package aula80;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDescontoProduto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDescontoProduto(double valor) {
            return valor * 0.05;
        }
    };

    public double calcularDescontoProduto(double valor) {
        return 0;
    }
}
