package br.edu.ifsp.poo.class03.ex01;

public class Personagem {
    public static String nome;

    private int idade;
    private Dublador dublador;

    public Personagem() {
    }

    public Personagem(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setDublador(Dublador dublador){
        this.dublador = dublador;
    }

    public Dublador getDublador(){
        return dublador;
    }

    public String getNome(){
        return nome;
    }


}
