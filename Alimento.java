package projetoPOO_Academia;

public class Alimento {
    
    private String nome;
    private double quantidade;
    private double calorias;

    public Alimento(String nome, double quantidade, double calorias){
        this.nome = nome;
        this.quantidade = quantidade;
        this.calorias = calorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return nome + " (Quantidade: " + quantidade + ", Calorias: " + calorias + ")";
    }
    
    
}
