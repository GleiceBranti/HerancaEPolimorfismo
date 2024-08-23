package com.empresa.animais;


public class Macaco extends Animal {
    public Macaco(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Macaco está Gritando");
    }


    public void subirArvores() {
    }
}
