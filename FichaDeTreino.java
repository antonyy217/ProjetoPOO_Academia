package projetoPOO_Academia;

import java.util.ArrayList;
import java.util.List;

public class FichaDeTreino extends Equipamento {
    private List<Exercicio> exercicio;

    public FichaDeTreino(String nome, String tipo, List <Exercicio> exercicio){
        super(nome, tipo, null);
        this.exercicio = exercicio;
    }

    public List<Exercicio> getExercicio() {
        return exercicio;
    }

    public void setExercicio(ArrayList<Exercicio> exercicio) {
        this.exercicio = exercicio;
    }

    public void adicionarExercicio(Exercicio exercicio){
        this.exercicio.add(exercicio);

    }

    

  

    
    
}
