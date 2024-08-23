package com.empresa.animais;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro("Mel", 12);
        animais[1] = new Cavalo("Napolitano", 7);
        animais[2] = new Preguica("Dorminhoca", 2);

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
