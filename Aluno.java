package projetoPOO_Academia;

public class Aluno extends Pessoa{
    private FichaDeTreino fichaDeTreino;
    private double progresso;
    private Alimentacao alimentacao;

    public Aluno(String nome,  int idade, String telefone, double progresso, FichaDeTreino fichaDeTreino, Alimentacao alimentacao){
        super(nome, idade, telefone);
        this.fichaDeTreino = fichaDeTreino;
        this.alimentacao = alimentacao;
        this.progresso = progresso;
    }

    public FichaDeTreino getFichaDeTreino() {
        return fichaDeTreino;
    }

    public void setFichaDeTreino(FichaDeTreino fichaDeTreino) {
        this.fichaDeTreino = fichaDeTreino;
    }

    public double getProgresso() {
        return progresso;
    }

    public void setProgresso(double progresso) {
        this.progresso = progresso;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    

}
