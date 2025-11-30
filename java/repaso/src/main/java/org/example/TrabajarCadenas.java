package org.example;

import java.util.Scanner;

public class TrabajarCadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        String frase = "al palo JuanFran del atleti";

        //Muestra la posicion de lo que busques
        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        //te dice el tamanyo del String
        int tamanyo = frase.length();
        System.out.println(tamanyo);

        //elegir una letra que imprimir
        System.out.println(frase.charAt(8));

        //agarrar un trozo del texto para decirlo por separado
        String trozo_final = frase.substring(8,17);
        System.out.println(trozo_final);

        //la ultima posicion de lo que buscas
        int posicion_ultima = frase.lastIndexOf("palo");
        System.out.println(posicion_ultima);

        //lo pone todo en mayusculas

        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        //lo pone todo en minusculas
        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        //Elimina todos los espacios el .trim() del inicio y fin
        String base_datos = "Raul          ";
        System.out.println(base_datos.trim() + "-" + base_datos + "#");

        //prueba de funcionamiento de comparar un raul con espacios y otro sin y colocar un trim al que tiene espacios
        boolean igual = base_datos.trim().equals("Raul");
        System.out.println(igual);

        //comparar dos textos ignorando mayusculas o minusculas con equalsignorescase
        boolean igual_sin_mayusculas = "Raul".equalsIgnoreCase("Raul");
        System.out.println(igual_sin_mayusculas);

        //reemplazar algo de la frase que quieras
        String frase_remplazos= frase.replace("palo", "florentino");
        System.out.println(frase_remplazos);

    }
}
