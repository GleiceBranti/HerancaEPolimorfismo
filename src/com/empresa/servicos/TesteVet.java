package com.empresa.servicos;

import com.empresa.animais.Animal;
import com.empresa.animais.Cachorro;
import com.empresa.animais.Cavalo;
import com.empresa.animais.Preguica;

public class TesteVet {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();

        Animal cachorro = new Cachorro("Mel", 12);
        Animal cavalo = new Cavalo("Napolitano", 7);
        Animal preguica = new Preguica("Dorminhoca", 2);

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
