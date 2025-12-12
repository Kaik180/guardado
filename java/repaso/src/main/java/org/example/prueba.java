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

    public static int[] eliminarCadaPaso(int[] vector, int paso) {
        int longitud = vector.length;
        int[] nuevo = new int[longitud];
        int contador = 0;

        for (int i = 0; i < longitud; i++) {
            if ((i + 1) % paso != 0) {
                nuevo[contador] = vector[i];
                contador++;
            }
        }
        return compactar(nuevo, contador);
    }

    public static int[] compactar(int[] vector, int contador) {
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = vector[i];
        }
        return resultado;
    }
    public static int[] quitarNumeros(int[] vector) {
        int longitud = vector.length;
        for (int paso = 2; paso <= longitud; paso++) {
            vector = eliminarCadaPaso(vector, paso);
            longitud = vector.length;
        }
        return vector;
    }

    public static int Filtro(int numero) {
        Scanner entrada = new Scanner(System.in);
        do {
            String linea = entrada.nextLine();

            try {
                numero = Integer.parseInt(linea);
                if (numero == 0) {

                    break;
                } else if (numero < 1 || numero > 10000) {
                    numero = -1;
                }
            } catch (NumberFormatException e) {
                numero = -1;
            }

        } while (numero == -1);

        return numero;
    }

    public static void main(String[] args) {
        while (true) {
            int numero = Filtro(-1);
            if (numero == 0) {
                break;
            }
            int[] vector = crearVector(numero);
            int[] resultado = quitarNumeros(vector);

            System.out.print(numero + ": ");
            for (int i = resultado.length - 1; i >= 0; i--) {
                System.out.print(resultado[i] + " ");
            }
            System.out.println();
        }
    }
}
