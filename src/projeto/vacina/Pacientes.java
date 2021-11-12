package projeto.vacina;

import java.util.ArrayList;

public class Pacientes extends Pessoas{
    private ArrayList<Integer> idPacientes = new ArrayList<Integer>();
    private ArrayList<Integer> rgsPacientes = new ArrayList<Integer>();
    private ArrayList<String> vacinasAplicadas = new ArrayList<String>();
    private ArrayList<String> problemasSaude = new ArrayList<String>();
    private Vacinacoes vacinacaoDB;
    
    Pacientes(Vacinacoes vacinacaoDB){
        this.vacinacaoDB = vacinacaoDB;
    }
    
    public void cadastrarPaciente(int rg, String vacinaAplicada, String problemasSaude){
        this.idPacientes.add(this.idPacientes.size() + 1);
        this.rgsPacientes.add(rg);
        this.vacinasAplicadas.add(vacinaAplicada);
        this.problemasSaude.add(problemasSaude);
        System.out.println("Paciente cadastrado com sucesso.");
    }
    
    public void consultarPaciente(int rg){
        int index = this.rgsPacientes.indexOf(rg);
        
        if(index == -1){
            System.out.println("Paciente não encontrado.");
            return;
        }
        
        System.out.println(String.format("Id: %s | RG: %s | Vacina: %s | Problemas de Saude: %s", this.idPacientes.get(index), this.rgsPacientes.get(index), this.vacinasAplicadas.get(index), this.problemasSaude.get(index)));
    }
    
    public void atualizarPaciente(int rg, String vacinaAplicada, String problemasSaude){
        int index = this.rgsPacientes.indexOf(rg);
        
        if(index == -1){
            System.out.println("Paciente não encontrado.");
            return;
        }
        
        this.vacinasAplicadas.set(index, vacinaAplicada);
        this.problemasSaude.set(index, problemasSaude);
        System.out.println("Paciente atualizado com sucesso.");
    }
    
    public void deletarPaciente(int rg) {
        int index = this.rgsPacientes.indexOf(rg);
        
        if(index == -1){
            System.out.println("Paciente não encontrado.");
            return;
        }
        
        this.idPacientes.remove(index);
        this.rgsPacientes.remove(index);
        this.vacinasAplicadas.remove(index);
        this.problemasSaude.remove(index);
        
        System.out.println("Paciente removido com sucesso.");
    }
}
