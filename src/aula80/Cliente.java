package aula80;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;

    @Override
    public String toString() {
        return "Cliente {" +
                "\n" +"nome=" + nome  +
                "\n" + "tipoClienteValor=" + tipoCliente.valor +
                "\n" + "tipoClienteNomeRelatorio=" + tipoCliente.valor +
                "\n" + "tipoCliente=" + tipoCliente +
                "\n" + '}';
    }

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
