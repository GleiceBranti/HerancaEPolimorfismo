package com.empresa.servicos;

import com.empresa.animais.*;

public class TesteZoo {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(0, new Coruja("", 3));
        zoologico.adicionarAnimal(1, new Macaco("", 3));
        zoologico.adicionarAnimal(2, new Tucano("", 3));
        zoologico.adicionarAnimal(3, new Elefante("", 3));
        zoologico.adicionarAnimal(4, new Leao("", 3));
        zoologico.adicionarAnimal(5, new Onca("", 3));
        zoologico.adicionarAnimal(6, new Tartaruga("", 3));
        zoologico.adicionarAnimal(7, new Jacare("", 3));
        zoologico.adicionarAnimal(8, new Giraffa("", 3));
        zoologico.adicionarAnimal(9, new Tamandua("", 3));



        zoologico.percorrerJaulas();
    }
}
