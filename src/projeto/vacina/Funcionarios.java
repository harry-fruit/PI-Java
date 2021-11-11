package projeto.vacina;

import java.util.ArrayList;

public class Funcionarios extends Pessoas{
    private ArrayList<Integer> idFuncionarios = new ArrayList<Integer>();
    private ArrayList<String> cargos = new ArrayList<String>();
    private ArrayList<String> nomesFuncionarios = new ArrayList<String>();
    
    public void cadastrarFuncionario(int numeroRg, String cargo){
        int index = this.rgs.indexOf(numeroRg);
        
        if(index == -1) {
            System.out.println("Não existe pessoas registradas com este RG.");
            return;
        };
        
        this.idFuncionarios.add(this.idFuncionarios.size() + 1);
        this.cargos.add(cargo);
        this.nomesFuncionarios.add(this.nomes.get(index));
        System.out.println("Cadastro realizado com sucesso.");
    }
    
    public void consultarTodosFuncionarios(){
        for(int index = 0; index < idFuncionarios.size(); index++){
            System.out.println(String.format("Id: %s | Nome: %s | Cargo: %s", this.idFuncionarios.get(index), this.nomesFuncionarios.get(index), this.cargos.get(index)));
        }
    }
    
    public String consultarFuncionario(int idFuncionario){
        int index = this.idFuncionarios.indexOf(idFuncionario);
        
        if(index == -1) {
            return "Não existe funcionarios registradas com este ID.";
        };
        
        return String.format("Id: %s | Nome: %s | Cargo: %s", this.idFuncionarios.get(index), this.nomesFuncionarios.get(index), this.cargos.get(index));
    }
    
    public void atualizarFuncionario(int idFuncionario, String cargo){
        int index = this.idFuncionarios.indexOf(idFuncionario);
        
        if(index == -1) {
            System.out.println("Não existe funcionarios registradas com este ID.");
            return; 
        };
        
        this.cargos.set(index, cargo);
        System.out.println("Funcionario atualizado com sucesso.");
        
    }
    
    public void deletarFuncionario (int idFuncionario){
        int index = this.idFuncionarios.indexOf(idFuncionario);
        
        if(index == -1) {
            System.out.println("Não existe funcionarios registradas com este ID.");
            return; 
        };
        
        this.idFuncionarios.remove(index);
        this.cargos.remove(index);
        this.nomesFuncionarios.remove(index);
        System.out.println("Funcionario removido com sucesso.");
    }
}
