package projeto.vacina;

import javax.swing.JOptionPane;

public class ProjetoVacina {

    public static void main(String[] args) {
        Vacinas vacinas = createVacinas();
        
        Vacinacoes novaVacinacao = new Vacinacoes(vacinas);
        novaVacinacao.cadastrarVacinacao("janeiro", "Qualquer", 2);
        novaVacinacao.consultarVacinacoes();
        
        menu();
    }
    
    public static void runPessoas (){
        Pessoas pessoasDB = new Pessoas();
        
        pessoasDB.cadastrarPessoa("Isaque", 21, 123456);
        pessoasDB.cadastrarPessoa("Juliana", 41, 555452);
        pessoasDB.cadastrarPessoa("Roberto Carlos", 66, 52431);
        pessoasDB.cadastrarPessoa("Romero Brito", 77, 789456);
        
        System.out.println(pessoasDB.consultarPessoa(785555));
        pessoasDB.atualizarPessoa("Romero Brito", 78, 789456);
        System.out.println(pessoasDB.consultarPessoa(789456));
        pessoasDB.deletarPessoa(789456);
        System.out.println(pessoasDB.consultarPessoa(789456));
    }
    
    public static void runFuncionarios(){
        Funcionarios funcionariosDB = new Funcionarios();
        funcionariosDB.cadastrarPessoa("Roger", 21, 123456);
        funcionariosDB.cadastrarPessoa("Catarina", 41, 555452);

        funcionariosDB.cadastrarFuncionario(123456, "Enfermeiro");
        funcionariosDB.cadastrarFuncionario(555455, "Enfermeira");
        funcionariosDB.cadastrarFuncionario(555452, "Enfermeira");
        
        funcionariosDB.consultarTodosFuncionarios();
        
        System.out.println(funcionariosDB.consultarFuncionario(1));
        funcionariosDB.deletarFuncionario(1);
        
        funcionariosDB.consultarTodosFuncionarios();
        
        funcionariosDB.atualizarFuncionario(2, "Enfermeira Chefe");
        funcionariosDB.consultarTodosFuncionarios();
    }
    
    public static void runVacinas(){
        Vacinas vacinasDB = new Vacinas();
        
        vacinasDB.cadastrarVacina(2, "Pfizer", "ND/A", "30 dias", "Pfizer");
        vacinasDB.cadastrarVacina(1, "J.J", "ND/A", "30 dias", "Johnsons");
        vacinasDB.cadastrarVacina(2, "CoronaVac", "ND/A", "30 dias", "Butantã");
        vacinasDB.cadastrarVacina(2, "AstraZeneca", "ND/A", "30 dias", "Lodres");
        vacinasDB.consultarVacinas();
        vacinasDB.atualizarVacina(2, 1, "Johnsons", "ND/A", "20 dias", "Johnsons");
        vacinasDB.consultarVacina(2);
        vacinasDB.removerVacina(3);
        vacinasDB.consultarVacinas();
    }
    
    public static Vacinas createVacinas(){
        Vacinas vacinasDB = new Vacinas();
        
        vacinasDB.cadastrarVacina(2, "Pfizer", "ND/A", "30 dias", "Pfizer");
        vacinasDB.cadastrarVacina(1, "J.J", "ND/A", "30 dias", "Johnsons");
        vacinasDB.cadastrarVacina(2, "CoronaVac", "ND/A", "30 dias", "Butantã");
        vacinasDB.cadastrarVacina(2, "AstraZeneca", "ND/A", "30 dias", "Lodres");
        return vacinasDB;
    }
    
    public static void menu(){
        int opcoes = Integer.parseInt(JOptionPane.showInputDialog("Insira a opção desejada: \n1 - Pessoas \n2 - Pacientes \n3 - Funcionarios \n4 - Vacina \n5 - Vacinacao "));
    }
    
}
