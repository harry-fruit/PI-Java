package projeto.vacina;

import java.util.ArrayList;

public class Pessoas {
    
    protected ArrayList<Integer> idPessoa = new ArrayList<Integer>();
    protected ArrayList<Integer> rgs = new ArrayList<Integer>();
    protected ArrayList<Integer> idades = new ArrayList<Integer>();
    
    protected ArrayList<String> nomes = new ArrayList<String>();
    
    public void cadastrarPessoa(String nome, int idade, int rg){
        this.idPessoa.add(idPessoa.size() + 1);
        this.nomes.add(nome);
        this.idades.add(idade);
        this.rgs.add(rg);
    }
    
    public String consultarPessoa(int numeroRg){
        int index = this.rgs.indexOf(numeroRg);
        
        if(index == -1) {
            return "Não existe pessoas registradas com este RG.";
        };
        
        return String.format("RG: %s, NOME: %s, IDADE: %s", this.rgs.get(index), this.nomes.get(index), this.idades.get(index));
    }
    
    public void atualizarPessoa(String nome, int idade, int rg){
        int index = this.rgs.indexOf(rg);
        
        if(index == -1) {
            System.out.println("Não existe pessoas registradas com este RG.");
            return;
        };
        
        this.rgs.set(index, rg);
        this.nomes.set(index, nome);
        this.idades.set(index, idade);
        
        System.out.println("Dados Atualizado com Sucesso.");
    }
    
    public void deletarPessoa(int rg){
        int index = this.rgs.indexOf(rg);
        
        if(index == -1) {
            System.out.println("Não existe pessoas registradas com este RG.");
            return;
        };
        
        this.idPessoa.remove(index);
        this.rgs.remove(index);
        this.nomes.remove(index);
        this.idades.remove(index);
    }
    
}
