/**
 * Candidato
 */
public class Candidato {
    String nome;
    String partido;
    int numeroCandidato;
    int idade;
    int teste;

    Candidato(){

    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public int getNumeroCandidato() {
        return numeroCandidato;
    }
    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }      
    public String toString() {
        return "Nome: " + nome + "Idade: " + idade + "Partido: " + partido + "Numero Candidato: " + numeroCandidato;
        
    }

}