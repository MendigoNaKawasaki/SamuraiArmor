package samuraiarmor;

public class Material{
    private int id;
    private String marca;
    private int stock;
    private String tamanho;
    private String cor;
    private String peso;
    private double preco;
    private boolean protecao;
    private String modalidade;
    
    public Material(int id, String marca, int stock, String tamanho, String cor, String peso, double preco, boolean protecao, String modalidade){
        this.id = id;
        this.marca = marca;
        this.stock = stock;
        this.tamanho = tamanho;
        this.cor = cor;
        this.peso = peso;
        this.preco = preco;
        this.protecao = protecao;
        this.modalidade = modalidade;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getPeso(){
        return peso;
    }

    public void setPeso(String peso){
        this.peso = peso;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public boolean getProtecao(){
        return protecao;
    }

    public void setProtecao(boolean protecao){
        this.protecao = protecao;
    }

    public String getModalidade(){
        return modalidade;
    }

    public void setModalidade(String modalidade){
        this.modalidade = modalidade;
    }
    
    public void atualizarStock(int quantidade){
        this.stock = this.stock + quantidade;
    }
}
