package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class BATERIAFUNCIONESTest {

    @Test
    void CUBO() {
        assertAll(
                () ->  assertEquals(8,BATERIAFUNCIONES.CUBO(2)),
                () ->  assertEquals(27,BATERIAFUNCIONES.CUBO(3))

        );

    }
    @Test

    void parImpar() {
        assertAll(
                () ->  assertFalse(BATERIAFUNCIONES.parImpar(3)),
                () ->   assertTrue(BATERIAFUNCIONES.parImpar(2))

        );

    }
    @Test

    void PEDIRNUMERO() {
        String entradaSimulada = "2";
       System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

     //falla porque no lo meti en en cubo si no en una funcion distinta para pedir
        assertEquals(2,BATERIAFUNCIONES.PEDIRNUMERO());

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));
        String salidaesperada = "introduce un numero...";
        assertTrue(salida.toString().contains(salidaesperada));
    }

}