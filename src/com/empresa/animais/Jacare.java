package com.empresa.animais;

public class Jacare extends Animal {
    public Jacare(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Jacare está Bramindo");
    }


    public void nadar() {

    }
}

