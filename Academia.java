package projetoPOO_Academia;


import java.util.ArrayList;
import java.util.List;


// onde está o centro das informações e classes
public class Academia {
    private String nome;
    private String endereco;
    private String telefone;
    private List <Funcionario> funcionarios;
    private List <Aluno> alunos;
    private List <FichaDeTreino> fichaDeTreino;

    public Academia(String nome, String endereco, String telefone, List <Funcionario> funcionarios, List <Aluno> alunos, List <FichaDeTreino> fichaDeTreino){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.funcionarios = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.fichaDeTreino = fichaDeTreino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List <Funcionario> getFuncionarios(){
        return funcionarios;
    }

    public List <Aluno> getAlunos(){
        return alunos;
    }

    public List <FichaDeTreino> getfichaDeTreino(){
        return fichaDeTreino;
    }
    

    
        
    

  



    

    
}
