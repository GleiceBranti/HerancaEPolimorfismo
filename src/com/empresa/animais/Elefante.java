package com.empresa.animais;

public class Elefante extends Animal {
    public Elefante(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O elefante está bramindo");
    }


    public void andar() {
    }
}
