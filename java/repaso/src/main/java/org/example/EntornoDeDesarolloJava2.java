package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class EntornoDeDesarolloJava2 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("En que frase tengo que buscar?");
        String frase = Teclado.nextLine();
        int pos = frase.indexOf("t");
        if (pos != -1) {
            pos = frase.indexOf("e");
            if (pos != -1) {
                pos = frase.indexOf(" "); // espacio entre "te" y "odio"
                if (pos != -1) {
                    pos = frase.indexOf("o");
                    if (pos != -1) {
                        pos = frase.indexOf("d");
                        if (pos != -1) {
                            pos = frase.indexOf("i");
                            if (pos != -1) {
                                pos = frase.indexOf("o");
                                if (pos != -1) {
                                    System.out.println("La frase contiene 'te odio'");
                                } else {
                                    System.out.println("Falta la última 'o'");
                                }
                            } else {
                                System.out.println("Falta la 'i'");
                            }
                        } else {
                            System.out.println("Falta la 'd'");
                        }
                    } else {
                        System.out.println("Falta la primera 'o'");
                    }
                } else {
                    System.out.println("Falta el espacio");
                }
            } else {
                System.out.println("Falta la 'e'");
            }
        } else {
            System.out.println("Falta la 't'");
        }
    }
}
