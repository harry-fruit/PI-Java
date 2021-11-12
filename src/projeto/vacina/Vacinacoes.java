package projeto.vacina;

import java.util.ArrayList;

public class Vacinacoes {
    protected ArrayList<Integer> idVacinacoes = new ArrayList<>();
    protected ArrayList<String> nomeVacinas = new ArrayList<>();
    protected ArrayList<String> datas = new ArrayList<>();
    protected ArrayList<String> locais = new ArrayList<>();
    protected Vacinas vacinasDB;
    
    Vacinacoes(Vacinas vacinasDB){
        this.vacinasDB = vacinasDB;
    }
    
    public void cadastrarVacinacao(String data, String local, int idVacina){  
        String nomeVacina = this.vacinasDB.consulteVacinaPorId(idVacina);
        
        this.idVacinacoes.add(this.idVacinacoes.size() + 1);
        this.datas.add(data);
        this.locais.add(local);
        this.nomeVacinas.add(nomeVacina);
        System.out.println("Vacinação cadastrada com sucesso.");
    }
    
    public void consultarVacinacoes(){
        String message;
        for(int index = 0; index < this.idVacinacoes.size(); index++){
            message = String.format("Id: %s | Data: %s | Local: %s | Nome Vacina: %s", this.idVacinacoes.get(index), this.datas.get(index), this.locais.get(index), this.nomeVacinas.get(index) );
            System.out.println(message);
        }
    }
    
    public void consultarVacinacao(int idVacinacao){
        int index = idVacinacoes.indexOf(idVacinacao);
        String message;
        
        if(index == -1){
            System.out.println("Nenhuma vacinação encontrada.");
        }
        
        message = String.format("Id: %s | Data: %s | Local: %s | Id Vacina: %s", this.idVacinacoes.get(index), this.datas.get(index), this.locais.get(index), this.nomeVacinas.get(index) );
        System.out.println(message);
    }
    
    public void atualizarVacinacao(int idVacinacao, String data, String local, String nomeVacina){
        int index = this.idVacinacoes.indexOf(idVacinacao);
    
        if(index == -1){
            System.out.println("Nenhuma vacinação encontrada.");
        }
        
        this.datas.set(index, data);
        this.locais.set(index, local);
        this.nomeVacinas.set(index, nomeVacina);
        System.out.println("Vacinacao atualizada com sucesso.");
    }
    
    public void deletarVacinacao(int idVacinacao){
        int index = this.idVacinacoes.indexOf(idVacinacao);
    
        if(index == -1){
            System.out.println("Nenhuma vacinação encontrada.");
        }
        
        this.idVacinacoes.remove(index);
        this.datas.remove(index);
        this.locais.remove(index);
        this.nomeVacinas.remove(index);
        System.out.println("Vacinação removida com sucesso.");
    }
    
}
