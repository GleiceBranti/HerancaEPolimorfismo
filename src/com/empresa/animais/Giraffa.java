package com.empresa.animais;


public class Giraffa extends Animal {
    public Giraffa(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A giraffa está zumbindo");
    }


    public void correr() {

    }
}
