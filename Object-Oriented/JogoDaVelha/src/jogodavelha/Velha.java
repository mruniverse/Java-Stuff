package jogodavelha;
/**
 *
 * @author Vitor
 */
public class Velha extends Jogador{
    private Jogador jogador1;
    private Jogador jogador2;
    public char a1, a2, a3, b1, b2, b3, c1, c2, c3;

    public Velha(){
        super();
        this.jogador1 = new Jogador();
        this.jogador2 = new Jogador();
        this.a1 = ' ';
        this.a2 = ' ';
        this.a3 = ' ';
        this.b1 = ' ';
        this.b2 = ' ';
        this.b3 = ' ';
        this.c1 = ' ';
        this.c2 = ' ';
        this.c3 = ' ';
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }
    
    public boolean verificaSimbolo(char s1, char s2){
        return s1 == s2;
    }
    
    public String verificaJogo(){
        if (isRowWon(a1, a2, a3)) {
            return "Velha";
        }
        if (isRowWon(b1, b2, b3)) {
            return "Velha";
        }
        if (isRowWon(c1, c2, c3)) {
            return "Velha";
        }
        if (isRowWon(a1, b1, c1)) {
            return "Velha";
        }
        if (isRowWon(a2, b2, c2)) {
            return "Velha";
        }
        if (isRowWon(a3, b3, c3)) {
            return "Velha";
        }
        if (isRowWon(a1, b2, c3)) {
            return "Velha";
        }
        if (isRowWon(a3, b2, c1)) {
            return "Velha";
        }
        return "Proximo";
    }
    
    public boolean isRowWon(char a, char b, char c) {
        return ((a == b) & (a == c) & (a != ' '));
    }
}


