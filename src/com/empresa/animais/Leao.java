package com.empresa.animais;


public class Leao extends Animal {
    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Leao está rugindo");
    }


    public void correr() {

    }
}
