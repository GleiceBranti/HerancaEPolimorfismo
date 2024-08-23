package com.empresa.animais;


public class Coruja extends Animal {
    public Coruja(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A Coruja  está Piando");
    }

    public void voar() {
    }

    }

