package samuraiarmor;

public class Encomenda {

    private String cliente;
    private String morada;
    private String produto;
    private int quantidade;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Encomenda(String cliente, String morada, String produto, int quantidade){
        this.cliente = cliente;
        this.morada = morada;
        this.produto = produto;
        this.quantidade = quantidade;
    }
}