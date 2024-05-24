package projetoPOO_Academia;

import java.util.ArrayList;
import java.util.List;

public class ExposicaoGerenciador {
    public static void main(String[] args) {

        // // aqui servirá como exposição das classes necessárias para o dono da academia, ou do funcionário encarregado pela gerência 

        // Criando a academia
        Academia academia = new Academia(null, null, null, null, null, null);
        academia.setNome("Academia XYZ");
        academia.setEndereco("Rua ABC, 123");
        academia.setTelefone("987654321");

        // criando uma lista de exercicio

        List<Exercicio> exerciciosPernaIniciante = new ArrayList<>();

        exerciciosPernaIniciante.add(new Exercicio("Supino", "Trabalha peitoral", 3, 12, 30.0));
        exerciciosPernaIniciante.add(new Exercicio(null, null, 0, 0, 0));



        // Cria alguns funcionários

        Funcionario funcionario1 = new Funcionario("João", 30, "111111111", "Instrutor", 2500.0);
        Funcionario funcionario2 = new Funcionario("Maria", 25, "222222222", "Recepcionista", 1000.0);

        // Adiciona funcionários à academia

        academia.getFuncionarios().add(funcionario1);
        academia.getFuncionarios().add(funcionario2);

        // Cria as fichas e alimentações dos alunos
        

        List <Alimento> alimentosConsumidosPedro = new ArrayList<>();
        alimentosConsumidosPedro.add(new Alimento("maçã", 5, 2.0));
        alimentosConsumidosPedro.add(new Alimento("laranja", 5, 5.5));

        List <Refeicao> listaRefePedro = new ArrayList<>();
        listaRefePedro.add(new Refeicao("janta", alimentosConsumidosPedro));

        //

        List <Alimento> alimentosConsumidosAna = new ArrayList<>();
        alimentosConsumidosAna.add(new Alimento("pera", 5, 10));
        
        List <Refeicao> listaRefeAna = new ArrayList<>();
        listaRefeAna.add(new Refeicao("almoço", alimentosConsumidosAna));

        //

        List <Alimento> alimentosConsumidoslelet = new ArrayList<>();
        alimentosConsumidoslelet.add(new Alimento("manga", 5, 10));

        List <Refeicao> listaRefeLelet = new ArrayList<>();
        listaRefeLelet.add(new Refeicao("merenda", alimentosConsumidoslelet));

        
        // Cria as fichas e a chama a refeicao dos alunos

        FichaDeTreino fichaPedroDeTreino = new FichaDeTreino("perna", "foco em crescimento muscular", exerciciosPernaIniciante);
        Alimentacao alimentacaoPedro = new Alimentacao(listaRefePedro);

        FichaDeTreino fichaAnaDeTreino = new FichaDeTreino("braço e bíceps", "foco em crescimento muscular", null);
        Alimentacao alimentacaoAna = new Alimentacao(listaRefeAna);
        

        FichaDeTreino fichaLelet = new FichaDeTreino("peito e ombro", null, exerciciosPernaIniciante);
        Alimentacao alimentacaoLelet = new Alimentacao(listaRefeLelet);

        // Cria alunos

        Aluno aluno1 = new Aluno("Pedro", 20, "(85) 987357916",0.0, fichaPedroDeTreino, alimentacaoPedro);
        Aluno aluno2 = new Aluno("Ana", 22, "444444444", 0.0, fichaAnaDeTreino, alimentacaoAna);
        Aluno aluno3 = new Aluno("Lelet Nascimento", 86, "85940022922", 0, fichaLelet, alimentacaoLelet);

        // Adiciona alunos à academia

        academia.getAlunos().add(aluno1);
        academia.getAlunos().add(aluno2);
        academia.getAlunos().add(aluno3);

        

        // Cria equipamentos
        Equipamento equipamento1 = new Equipamento("Esteira", "Cardio", null);
        Equipamento equipamento2 = new Equipamento("Bicicleta Ergométrica", "Cardio", null);

        // Adiciona equipamentos
        Equipamento equipamentosAcademia = new Equipamento();
        equipamentosAcademia.adicionarEquipamento(equipamento1);
        equipamentosAcademia.adicionarEquipamento(equipamento2);


        // Exibindo informações da academia
        //
        //
        //
        //
        System.out.println("Informações da Academia:");
        System.out.println("Nome: " + academia.getNome());
        System.out.println("Endereço: " + academia.getEndereco());
        System.out.println("Telefone: " + academia.getTelefone());

        // Exibindo informações dos funcionários
        //
        //
        System.out.println("\nFuncionários:");
        for (Funcionario funcionario : academia.getFuncionarios()) {
            System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo() + ", Salário: " + funcionario.getSalario());
        }


        // Exibindo informações dos alunos
        //
        //
        System.out.println("\nAlunos:");
        for (Aluno aluno : academia.getAlunos()) {
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade() + ", Telefone: " + aluno.getTelefone());
            System.out.println("Ficha de Treino: " + aluno.getFichaDeTreino().getNome() + ". O objetivo: " +aluno.getFichaDeTreino().getTipo());
            System.out.println("Alimentos: " + aluno.getAlimentacao());
            System.out.println("");
        }

        // Exibindo informações dos equipamentos
        //
        //
        System.out.println("\nEquipamentos:");
        for (Equipamento equipamento : equipamentosAcademia.getListaEquipamentos()) {
            System.out.println("Nome: " + equipamento.getNome() + ", Tipo: " + equipamento.getTipo());
        }
    }}