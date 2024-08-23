package com.empresa.servicos;

import com.empresa.animais.*;

public class Zoologico {
    private Animal[] jaulas = new Animal[10];

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        }
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {

                animal.emitirSom();


                if (animal instanceof Coruja) {
                    ((Coruja) animal).voar();
                } else if (animal instanceof Macaco) {
                    ((Macaco) animal).subirArvores();
                } else if (animal instanceof Tucano) {
                    ((Tucano) animal).voar();
                } else if (animal instanceof Elefante) {
                    ((Elefante) animal).andar();
                } else if (animal instanceof Leao) {
                    ((Leao) animal).correr();
                    ((Onca) animal).correr();
                } else if (animal instanceof Tartaruga) {
                    ((Tartaruga) animal).andarDevagar();
                } else if (animal instanceof Jacare) {
                    ((Jacare) animal).nadar();
                } else if (animal instanceof Giraffa) {
                    ((Giraffa) animal).correr();
                } else if (animal instanceof Tamandua) {
                    ((Tamandua) animal).subirArvores();
                }
            }
        }
    }
    }


