package projetoPOO_Academia;

import java.util.List;


public class Refeicao {
    private String tipo;
    private List <Alimento> alimentosConsumidos;

    public Refeicao(String tipo,List <Alimento> alimentosConsumidos){
        this.tipo = tipo;
        this.alimentosConsumidos = alimentosConsumidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Alimento> getAlimentosConsumidos() {
        return alimentosConsumidos;
    }

    public void setAlimentosConsumidos(List<Alimento> alimentosConsumidos) {
        this.alimentosConsumidos = alimentosConsumidos;
    }

    @Override
    public String toString() {
        if (alimentosConsumidos == null || alimentosConsumidos.isEmpty()) {
            return tipo + ": Nenhum alimento registrado.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(tipo).append(": ");
        for (Alimento a : alimentosConsumidos) {
            sb.append(a.toString()).append(", ");
        }
        return sb.toString();
    }
}
