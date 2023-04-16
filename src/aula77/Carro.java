package aula77;

public class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;

    //    public final double VELOCIDADE_LIMITE;

    public Carro() {
//        VELOCIDADE_LIMITE = 300;
    }

    public Carro(String nome) {
//        VELOCIDADE_LIMITE = 250;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" + "nome='" + nome + '\'' + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
