package com.empresa.servicos;
import com.empresa.animais.Animal;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando " + animal.getNome());
        animal.emitirSom();
    }
}
