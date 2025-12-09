package org.example;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        //Vamos a hacer el promedio y la suma de los numeros dentro de un vector
        Scanner teclado = new Scanner(System.in);

        // 1. Declaramos un vector de 5 posiciones
        int[] numeros = new int[5];

        // 2. Rellenamos el vector con datos
        System.out.println("Introduce 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // 3. Mostramos el contenido del vector
        System.out.println("Contenido del vector:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // 4. Calculamos suma y promedio
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
