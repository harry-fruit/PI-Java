package projeto.vacina;

public class ProjetoVacina {

    public static void main(String[] args) {
        Pessoas pessoasDB = new Pessoas();
        
        pessoasDB.cadastrarPessoa("Isaque", 21, 123456);
        pessoasDB.cadastrarPessoa("Juliana", 41, 555452);
        pessoasDB.cadastrarPessoa("Romero Brito", 77, 789456);
        pessoasDB.cadastrarPessoa("Roberto Carlos", 66, 52431);
        
        System.out.println(pessoasDB.consultarPessoa(789456));
    }
    
}
