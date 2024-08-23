package com.empresa.animais;


public class Onca extends Animal {
    public Onca(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A onca está ...");
    }


    public void correr() {

    }
}
