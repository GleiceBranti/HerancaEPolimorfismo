package com.empresa.animais;


public class Tucano extends Animal {
    public Tucano(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Tucano está cantando");
    }

    public void voar() {
    }
}


