package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArraysCompleto {
    public static void main(String[] args) {

        // 1. Crear un array
        int[] numeros = {5, 1, 8, 3, 2};

        // 2. Acceder a un elemento
        System.out.println("Elemento en posición 2: " + numeros[2]);

        // 3. Modificar un elemento
        numeros[0] = 10;
        System.out.println("Nuevo valor en posición 0: " + numeros[0]);

        // 4. Recorrer el array (for tradicional)
        System.out.println("\nRecorriendo con for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Pos " + i + ": " + numeros[i]);
        }

        // 5. Recorrer el array (for each)
        System.out.println("\nRecorriendo con foreach:");
        for (int n : numeros) {
            System.out.println(n);
        }

        // 6. Buscar un valor (búsqueda simple)
        int buscado = 8;
        boolean encontrado = false;
        for (int n : numeros) {
            if (n == buscado) {
                encontrado = true;
                break;
            }
        }
        System.out.println("¿Está el número 8?: " + encontrado);

        // 7. Ordenar el array
        //no quita numeros repetidos
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // 8.1. Rellenar el array con un valor
        int[] relleno = new int[5];
        Arrays.fill(relleno, 7);
        System.out.println("Array rellenado con 7: " + Arrays.toString(relleno));
        // Mostramos el contenido
        System.out.println("Array rellenado con números aleatorios: " + Arrays.toString(relleno));
        // 8.2.
        int rellenoo[] = new int[5];

        // Generador de números aleatorios
        Random rand = new Random();

        // Rellenamos el array con números aleatorios
        for (int i = 0; i < relleno.length; i++) {
            rellenoo[i] = rand.nextInt(10);
            // nextInt(10) genera números del 0 al 9
        }
        // 8.3. caso de que queramos meter numeros randoms en un String
        String[] palabras = new String[5];

        // Rellenamos el array con números aleatorios convertidos a String
        for (int i = 0; i < palabras.length; i++) {
            int numeroRandom = rand.nextInt(10); // 0 al 9
            palabras[i] = String.valueOf(numeroRandom);
            // También valdría: palabras[i] = "" + numeroRandom;
        }

        System.out.println("Array String con números aleatorios: " + Arrays.toString(palabras));



        // 9. Copiar un array
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Copia del array: " + Arrays.toString(copia));

        // 10. Copiar solo una parte del array
        int[] copiaParcial = Arrays.copyOfRange(numeros, 1, 4);
        System.out.println("Copia parcial (pos 1 a 3): " + Arrays.toString(copiaParcial));

        // 11. Comparar arrays
        System.out.println("\n¿numeros y copia son iguales?: " + Arrays.equals(numeros, copia));

        // 12. Convertir array a cadena para mostrarlo
        System.out.println("\nArray como texto: " + Arrays.toString(numeros));

        // 13. Búsqueda binaria (solo si está ordenado)
        int index = Arrays.binarySearch(numeros, 8);
        System.out.println("Búsqueda binaria del 8 → posición: " + index);
    }
}

