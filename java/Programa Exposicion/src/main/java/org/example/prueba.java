package org.example;
import java.util.Scanner;

public class prueba {

    public static int[] crearVector(int n) {
        int[] vector = new int[n];
        for (int i = 0; i < n; i++){
            vector[i] = i + 1;
        }
        return vector;
    }
    public static int[] eliminarCadaPaso(int[] vector, int paso) {
        int longitud = vector.length;
        int[] nuevo = new int[longitud];
        int contador = 0;

        for (int i = 0; i < longitud; i++) {
            if (i % paso != 0) {
                nuevo[contador++] = vector[i];
            }
        }
        return compactar(nuevo, contador);
    }

    public static int[] compactar(int[] vector, int contador) {
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) resultado[i] = vector[i];
        return resultado;
    }

    public static int[] quitarNumeros(int[] vector) {
        int paso = 2;
        while (paso <= vector.length) {
            vector = eliminarCadaPaso(vector, paso);
            paso++;
        }
        return vector;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            int n = entrada.nextInt();
            if (n == 0){
                break;
            }

            int[] vector = crearVector(n);
            int[] resultado = quitarNumeros(vector);

            System.out.print(n + ": ");
            for (int i = resultado.length - 1; i >= 0; i--) {
                System.out.print(resultado[i]);
            }
            System.out.println();
        }
    }
}


