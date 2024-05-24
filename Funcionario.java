package projetoPOO_Academia;



public class Funcionario extends Pessoa{
    public String cargo;
    public double salario;

   
    
    public Funcionario(String nome, int idade, String telefone, String cargo, double salario){
        super(nome, idade, telefone);
        this.cargo = cargo;
        this.salario = salario;
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

   

    
}
