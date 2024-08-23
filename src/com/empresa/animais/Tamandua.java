package com.empresa.animais;


public class Tamandua extends Animal {
    public Tamandua(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O tamandua está sem som");
    }

    public void subirArvores() {
        System.out.println("O tamandua esta subindo na árvore");
    }
}
