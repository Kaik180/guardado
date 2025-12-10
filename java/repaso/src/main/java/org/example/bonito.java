package org.example;
import java.util.Scanner;

public class bonito {
    public static int[] crearVector(int numero) {
        int[] vector = new int[numero];
        for (int i = 0; i < numero; i++) {
            vector[i] = i + 1;
        }
        return vector;
    }

    public static int[] quitarNumeros(int[] vector) {
        int longitud = vector.length;

        // El for empieza en 2 y va aumentando el paso automáticamente (marcando las rondas donde vamos quitando el numero de esa misma posicion) dolor
        for (int paso = 2; paso <= longitud; paso++) {
            int[] nuevo = new int[longitud];
            int contador = 0;
            //Creamos el nuevo vector
            for (int i = 0; i < longitud; i++) {
                if ((i + 1) % paso != 0) {
                    nuevo[contador] = vector[i];
                    contador++;
                }
            }

            // Guardamos el vector sin los ceros
            int[] compactado = new int[contador];
            for (int i = 0; i < contador; i++) {
                compactado[i] = nuevo[i];
            }

            vector = compactado;
            longitud = contador;
        }

        return vector;
    }
    public static int Filtro(int numero) {
        Scanner entrada = new Scanner(System.in);
        // Bucle que se repite hasta que el número sea correcto
        do {
            System.out.print("Introduce un número entre 1 y 10000: ");
            String linea = entrada.nextLine();

            try {
                numero = Integer.parseInt(linea);
                if (numero < 1 || numero > 10000) {
                    System.out.println(" Número fuera de rango. Debe estar entre 1 y 10000.");
                    numero = 0;
                }
            } catch (NumberFormatException e) {
                System.out.println(" Entrada inválida. Solo se permiten números enteros.");
                numero = 0;
            }

        } while (numero == 0);

        return numero;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();
        Filtro(numero); //filtramos el numero para saber que es correcto :D

        // Crear vector
        int[] vector = crearVector(numero);

        // enseñar el vector que hemos creado :3
        System.out.print("Vector inicial: ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        // eliminar los numeros que tengamos que eliminar  :^/
        int[] resultado = quitarNumeros(vector);

        // Mostrar resultado final ºWº
        System.out.print("Números afortunados: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
