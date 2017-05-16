/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author Vitor
 */
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
