package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bonitoTest {

    @Test
    void testCrearVector() {
        int[] vector = bonito.crearVector(5); // crear vector de 5
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, vector); // debe salir [1,2,3,4,5]
    }

    @Test
    void testEliminarCadaPaso() {
        int[] vector = {1, 2, 3, 4, 5, 6}; // vector inicial
        int[] resultado = bonito.eliminarCadaPaso(vector, 2); // eliminamos cada 2 empezando por el primero
        assertArrayEquals(new int[]{2, 4, 6}, resultado); // deben quedar los pares
    }

    @Test
    void testCompactar() {
        int[] vector = {1, 2, 3, 0, 0}; // vector con ceros
        int[] resultado = bonito.compactar(vector, 3); // compactamos hasta contador=3
        assertArrayEquals(new int[]{1, 2, 3}, resultado); // deben quedar solo los 3 primeros
    }

    @Test
    void testQuitarNumeros() {
        int[] vector = bonito.crearVector(10);
        int[] resultado = bonito.quitarNumeros(vector);
        assertArrayEquals(new int[]{4, 6, 10}, resultado);
    }
}


