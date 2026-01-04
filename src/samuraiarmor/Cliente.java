package samuraiarmor;

public class Cliente {

    private int id;
    private String nome;
    private String email;
    private String morada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Cliente(int id, String nome, String email, String morada, String cp) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.morada = morada;
    }
}