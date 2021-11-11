package projeto.vacina;

import java.util.ArrayList;

public class Pessoas {
    
    private ArrayList<Integer> idPessoa = new ArrayList<Integer>();
    private ArrayList<Integer> rgs = new ArrayList<Integer>();
    private ArrayList<Integer> idades = new ArrayList<Integer>();
    
    private ArrayList<String> nomes = new ArrayList<String>();
    
    public void cadastrarPessoa(String nome, int idade, int rg){
        this.idPessoa.add(idPessoa.size() + 1);
        this.nomes.add(nome);
        this.idades.add(idade);
        this.rgs.add(rg);
    }
    
    public String consultarPessoa(int numeroRg){
        int index = this.rgs.indexOf(numeroRg);
        
        return String.format("RG: %s, NOME: %s, IDADE: %s", index, this.nomes.get(index), this.idades.get(index));
    }
}
