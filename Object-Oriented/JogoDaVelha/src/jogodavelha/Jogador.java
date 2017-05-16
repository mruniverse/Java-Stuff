
package jogodavelha;

public class Jogador {
    private String nome;
    private char simbolo;
   
    public Jogador() {
        this.nome = null;
        this.simbolo = ' ';
    }

    public Jogador(String n, char s) {
        this.nome = n;
        this.simbolo = s;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
    
}
