package org.example;

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(10); // número entre 0 y 9
        System.out.println("Número aleatorio: " + numero);
    }
}
