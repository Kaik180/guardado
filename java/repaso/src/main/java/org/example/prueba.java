package org.example;

import java.util.Scanner;

public class prueba {

    public static int[] crearVector(int numero) {
        int[] vector = new int[numero];
        for (int i = 0; i < numero; i++) {
            vector[i] = i + 1;
        }
        return vector;
    }

    public static int[] quitarNumeros(int[] vector) {
        int longitud = vector.length;
        for (int paso = 2; paso <= longitud; paso++) {
            int[] nuevo = new int[longitud];
            int contador = 0;

            for (int i = 0; i < longitud; i++) {
                if ((i + 1) % paso != 0) {
                    nuevo[contador] = vector[i];
                    contador++;
                }
            }

            int[] compactado = new int[contador];
            for (int i = 0; i < contador; i++) {
                compactado[i] = nuevo[i];
            }

            vector = compactado;
            longitud = contador;
        }

        return vector;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int numero = entrada.nextInt();
            if (numero == 0){
                break;
            }
            int[] vector = crearVector(numero);
            int[] resultado = quitarNumeros(vector);


            System.out.print(numero + ": ");
            for (int num : resultado) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}