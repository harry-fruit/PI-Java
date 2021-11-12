package projeto.vacina;

import java.util.ArrayList;

public class Vacinas {
    protected ArrayList<Integer> idVacinas = new ArrayList<>(); 
    protected ArrayList<Integer> doses = new ArrayList<>();
    protected ArrayList<String> nomesVacinas = new ArrayList<>(); 
    protected ArrayList<String> reacoes = new ArrayList<>(); 
    protected ArrayList<String> validades = new ArrayList<>(); 
    protected ArrayList<String> fabricantes = new ArrayList<>(); 
    
    public void cadastrarVacina(int doses, String nomeVacina, String reacoes, String validade, String fabricante){ 
        this.idVacinas.add(this.idVacinas.size() + 1);
        this.nomesVacinas.add(nomeVacina);
        this.reacoes.add(reacoes);
        this.validades.add(validade);
        this.fabricantes.add(fabricante);
        this.doses.add(doses);
        
        System.out.println("Vacina cadastrada com sucesso.");
    }
    
    public void consultarVacinas(){
        String message;
        for(int index = 0; index < this.idVacinas.size(); index++){
            message = String.format("Id: %s | Nome: %s | Reações: %s | Validade: %s | Fabricante: %s | Doses: %s", this.idVacinas.get(index), this.nomesVacinas.get(index), this.reacoes.get(index), this.validades.get(index), this.fabricantes.get(index), this.doses.get(index));
            System.out.println(message);
        }
    }
    
    public void consultarVacina(int idVacina){
        int index = this.idVacinas.indexOf(idVacina);
        String message;
        
        if (index == -1){
            System.out.println("Nenhuma vacina corresponde à este ID.");
            return;
        }
        
        message = String.format("Id: %s | Nome: %s | Reações: %s | Validade: %s | Fabricante: %s | Doses: %s", this.idVacinas.get(index), this.nomesVacinas.get(index), this.reacoes.get(index), this.validades.get(index), this.fabricantes.get(index), this.doses.get(index));

        
        System.out.println(message);
    }
    
    public void atualizarVacina(int idVacina, int doses, String nome, String reacoes, String validade, String fabricante) {
        int index = this.idVacinas.indexOf(idVacina);
        System.out.println(index);
        
        if (index == -1){
            System.out.println("Nenhuma vacina corresponde à este ID.");
            return;
        }
        
        this.nomesVacinas.set(index, nome);
        this.doses.set(index, doses);
        this.reacoes.set(index, reacoes);
        this.fabricantes.set(index, fabricante);
        this.validades.set(index, validade);

        System.out.println("Vacina atualizada com sucesso.");
    }
    
    public void removerVacina(int idVacina){
        int index = this.idVacinas.indexOf(idVacina);
        
        if (index == -1){
            System.out.println("Nenhuma vacina corresponde à este ID.");
            return;
        }
        this.idVacinas.remove(index);
        this.nomesVacinas.remove(index);
        this.doses.remove(index);
        this.reacoes.remove(index);
        this.fabricantes.remove(index);
        this.validades.remove(index);
        System.out.println("Vacina removida com sucesso.");
    }
    
    public String consulteVacinaPorId (int idVacina){
        int index = this.idVacinas.indexOf(idVacina);
        
        if(index == -1){
            return "ND/A";
        }
        
        return this.nomesVacinas.get(index);
    }
}
