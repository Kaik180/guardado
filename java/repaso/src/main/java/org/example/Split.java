package org.example;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Pedimos una frase al usuario
        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        // 2. Utilizamos split para separar la frase por espacios
        // Esto genera un vector de Strings
        String[] palabras = frase.split(" ");

        // 3. Mostramos cada palabra en una línea
        System.out.println("\nPalabras encontradas:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);
        }

        // 4. Mostramos cuántas palabras hay
        System.out.println("Número total de palabras: " + palabras.length);
    }
}
