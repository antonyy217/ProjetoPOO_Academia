package projetoPOO_Academia;

public class Exercicio {
    private String nome;
    private String descricao;
    private int duracao;
    private int repeticao;
    private double carga;

    public Exercicio(String nome, String descricao, int duracao, int repeticao, double carga){
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.repeticao = repeticao;
        this.carga = carga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(int repeticao) {
        this.repeticao = repeticao;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
}
