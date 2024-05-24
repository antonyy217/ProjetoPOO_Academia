package projetoPOO_Academia;

import java.util.ArrayList;
import java.util.List;

public class Equipamento {
    private String nome;
    private String tipo;
    private List<Equipamento> listaEquipamentos;

    

    public Equipamento(String nome, String tipo, List<Equipamento> listaEquipamentos){
        this.nome = nome;
        this.tipo = tipo;
        this.listaEquipamentos = listaEquipamentos;                
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Equipamento() {
        this.listaEquipamentos = new ArrayList<>();
    }

    public List<Equipamento> getListaEquipamentos() {
        return this.listaEquipamentos;
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        this.listaEquipamentos.add(equipamento);
    }
}


    