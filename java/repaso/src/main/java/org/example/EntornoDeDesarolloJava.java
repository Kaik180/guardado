package org.example;

import java.util.Scanner;

public class EntornoDeDesarolloJava {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Di cuantas veces quieres repetir la prueba");
        int numCasos = Teclado.nextInt();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }

    }
    public static void casoDePrueba() {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("di quien eres");
            String frase = Teclado.nextLine(); //pedimos que digan su nombre
            String[] palabras = frase.split(" "); //metemos la frase que digan al vector
            System.out.println("hola, "+ palabras[1]); //nombramos la posicion donde esta su nombre

    } // casoDePrueba

}
