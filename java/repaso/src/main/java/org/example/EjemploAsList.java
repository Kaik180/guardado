package org.example;

import java.util.Arrays;
import java.util.List;

public class EjemploAsList {
    public static void main(String[] args) {

        // 1. Creamos un array normal
        String[] colores = {"Rojo", "Verde", "Azul"};

        // 2. Convertimos el array a una lista
        List<String> listaColores = Arrays.asList(colores);

        // 3. Mostramos la lista
        System.out.println("Lista de colores:");
        for (String color : listaColores) {
            System.out.println("- " + color);
        }

        // 4. Modificamos un elemento (se permite)
        listaColores.set(1, "Amarillo");
        System.out.println("Después de modificar:");
        System.out.println(listaColores);

        // no se puede agregar ni quitar elementos
        // listaColores.add("Negro"); --> ERROR
        // listaColores.remove(0);    --> ERROR
    }
}
