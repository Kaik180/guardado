package org.example;

import java.util.Scanner;

public class EntornoDeDesarolloJava {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int numero = Teclado.nextInt();
        Teclado.nextLine();
        System.out.println("Quien eres(Contesta Soy X) : ");
        //el for para hacer un bucle del numero de personas que se presenten
        for (int i=0; i<=numero;i++){

            String frase = Teclado.nextLine(); //pedimos que digan su nombre
            String[] palabras = frase.split(" "); //metemos la frase que digan al vector
            System.out.println("hola,"+ palabras[1]); //nombramos la posicion donde esta su nombre

        }

    }

}
