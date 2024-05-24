package projetoPOO_Academia;

import java.util.List;

public class Alimentacao {
    private List<Refeicao> refeicao;

    public Alimentacao(List<Refeicao> refeicao){
        this.refeicao = refeicao;

    }

    public List<Refeicao> getAlimentacao() {
        return refeicao;
    }

    public void setRefeicao(List<Refeicao> refeicao) {
        this.refeicao = refeicao;
    }

    @Override
    public String toString() {
        if (refeicao == null || refeicao.isEmpty()) {
            return "Nenhuma refeição registrada.";
        }
        StringBuilder sb = new StringBuilder();
        for (Refeicao r : refeicao) {
            sb.append(r.toString()).append("\n");
        }
        return sb.toString();
    }
}
