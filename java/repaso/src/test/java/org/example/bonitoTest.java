package org.example;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class bonitoTest {

    @Test
    void testCrearVector() {
        int[] vector = bonito.crearVector(5); //  crear vector de 5
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, vector); // que salga el vector de 5 bien
    }

    @Test
    void testEliminarCadaPaso() {
        int[] vector = {1, 2, 3, 4, 5, 6}; //creamos el vector que vamos a pasar
        int[] resultado = bonito.eliminarCadaPaso(vector, 2); //le pasamos el vector y los pasos
        assertArrayEquals(new int[]{1, 3, 5}, resultado); //deberia salir asi elvector anterior
    }

    @Test
    void testCompactar() {
        int[] vector = {1, 2, 3, 0, 0}; //le pasamos  un vector con 0
        int[] resultado = bonito.compactar(vector, 3); //le pasamos el vector con el contador en 3
        assertArrayEquals(new int[]{1, 2, 3}, resultado); //comprobamos que salga bien
    }

    @Test
    void testQuitarNumeros() {
        int[] vector = bonito.crearVector(10);
        int[] resultado = bonito.quitarNumeros(vector);
        // según el ejemplo del juez, para 10 los afortunados son {10, 6, 4}
        assertArrayEquals(new int[]{10, 6, 4}, resultado);
    }

    @Test
    void testSalidaConsola() {
        // Simulamos entrada "10\n0\n"
        String entradaSimulada = "10\n0\n";
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        Main.main(new String[]{}); // ejecutamos el programa

        String salidaEsperada = "10: 10 6 4";
        assertTrue(salida.toString().contains(salidaEsperada));
    }
}
