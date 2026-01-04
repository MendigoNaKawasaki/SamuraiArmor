package samuraiarmor;

public class Capacete extends Material{
    public Capacete(int id, String marca, int stock, String tamanho, String cor, double preco, boolean protecao, String modalidade){
        super(id, marca, stock, tamanho, cor, "N/A", preco, true, modalidade);
    }
}