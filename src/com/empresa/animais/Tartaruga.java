package com.empresa.animais;


public class Tartaruga extends Animal {
    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A tartaruga está calada");
    }

    public void andarDevagar() {

    }
}
