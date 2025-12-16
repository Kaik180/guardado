package org.example;
import java.util.Scanner;

/**
 * @Author Kevin Muñoz Corcoles
 * @deprecated  implementa la generación y filtrado de números afortunados.
 * Contiene métodos para crear vectores, eliminar elementos según reglas,
 * compactar resultados y aplicar la salida de números afortunados (mayor a menor).
 *
 */

public class NumerosAfortunados  {

    /**
     * @param numero - Pasamos el numero para crear un vector con el tamaño de ese numero
     * @return vector - devolvemos el vector creado
     */
    public static int[] crearVector(int numero) {
        int[] vector = new int[numero]; //Crea la anchura del vector
        for (int i = 0; i < numero; i++) { // mete los numeros en orden
            vector[i] = i + 1;
        }
        return vector;
    }
    /**
     * @param vector - pasamos el vector
     * @param paso - pasamos el paso que es cada posicion que queremos quitar ( cada 2, cada 3...)
     * @return compactar(nuevo, contador) - devolvemos el vector despues de ser compactado
     */
    public static int[] eliminarCadaPaso(int[] vector, int paso) {
        int longitud = vector.length; //tomamos la longitud
        int[] nuevo = new int[longitud]; //creamos el nuevo vector que utilizaremos
        int contador = 0; //contamos cuantos espacios tendra que tener el nuevo vector

        for (int i = 0; i < longitud; i++) {
            if (i % paso != 0) { // eliminamos el primero y luego cada 'paso' (índices múltiplos de paso)
                nuevo[contador] = vector[i]; //colocamos solo los numeros que queramos en posiciones ordenadas
                contador++; //contamos el espacio
            }
        }
        return compactar(nuevo, contador); //antes de entregarlo lo compactamos llamando a la funcion
    }
    /**
     * @param vector - pasamos el vector con los espacio con 0
     * @param contador - pasamos el contador con los espacios rellenos con numeros
     * @return resultado - devolvemos el vector sin espacio con 0
     */
    public static int[] compactar(int[] vector, int contador) {
        int[] resultado = new int[contador]; //creamos el vector final
        for (int i = 0; i < contador; i++) {
            resultado[i] = vector[i]; //metemos los numeros hasta llenar el resultado, controlado gracias al contador
        }
        return resultado;
    }

    /**
     * @param vector - Pasamos el vector con todos los numeros
     * @return vector - devuelve el vector  con los numeros afortunados despues de haber sido eliminado y compactado al maximo
     */
    public static int[] quitarNumeros(int[] vector) {
        int longitud = vector.length;
        for (int paso = 2; paso <= longitud; paso++) {
            vector = eliminarCadaPaso(vector, paso); // usamos la funcion eliminarCadaPaso para eliminar esos numeros
            longitud = vector.length; //guardamos la nueva longitud del vector
        }
        return vector;
    }
    /**
     * @param numero - pasamos -1 àra asegurarnos que el bucle se hara
     * @return numero- el numero ya verificado que hayamos elegido
     */
    public static int Filtro(int numero) {
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Introduce un número entre 1 y 10000 (0 para salir): ");
            String linea = entrada.nextLine();

            try {
                numero = Integer.parseInt(linea);
                if (numero == 0) { //si es cero nos da igual porque el 0 es cerrar el programa

                    break;
                } else if (numero < 1 || numero > 10000) { //queremos que sea el numero de este rango de numeros
                    System.out.println("Número fuera de rango. Debe estar entre 1 y 10000.");
                    numero = -1;
                }
            } catch (NumberFormatException e) { //si el que mete el numero de casualidad o saber porque mete una letra se lo invalidamos
                System.out.println("Entrada inválida. Solo se permiten números enteros.");
                numero = -1;
            }

        } while (numero == -1); //hacemos que el bucle siempre se repita haciendo que en caso de que meta algo erroneo el numero sea -1

        return numero;
    }

    public static void main(String[] args) {
        while (true) {
            int numero = Filtro(-1); //Filtramos el numero usando la funcion filtro
            if (numero == 0) {
                System.out.println("Programa terminado.");
                break;
            }
            int[] vector = crearVector(numero); //usamo la funcion crear vector para crar el vector que necesitamos

            // enseñar el vector que hemos creado :3
            System.out.print("Vector inicial: ");
            for (int num : vector) {
                System.out.print(num + " ");
            }
            System.out.println();

            // eliminar los numeros que tengamos que eliminar  :^/ (modo termineitor)
            int[] resultado = quitarNumeros(vector); //Usamos la funcion quitar numeros

            // Mostrar resultado final ºWº
            System.out.print("Números afortunados: ");
            for (int i = resultado.length - 1; i >= 0; i--) {
                System.out.print(resultado[i] + " ");
            }
            System.out.println();
        }
    }
}