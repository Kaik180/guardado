package org.example;

import java.util.Scanner;

public class FUNCION2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una cadena: ");
        String frase = teclado.nextLine();
        String Mayuscula = metodo1(frase);
        System.out.println(Mayuscula);
        int total_vocales = metodo2(frase);
        System.out.println("las vocales encontradas son: "+ total_vocales);



    }
    public static String metodo1 (String frase){
        String fraseM = frase.toUpperCase();
         return fraseM;

    }

    /**
     * @author Kevin
     * @version 1.0
     * metodo para contar las vocales dentro de una frase
     * @return devuelve la cantidad de vocales contadas
     */
    public static int metodo2 (String frase){
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        for (int j=0; j< frase.length(); j++){
            switch (frase.charAt(j)){
                case 'a' :
                    a++;
                    break;
                case 'e' :
                    e++;
                    break;
                case 'i' :
                    i++;
                    break;
                case 'o' :
                    o++;
                    break;
                case 'u' :
                    u++;
                    break;
            }

        }
        System.out.println("a: "+ a);
        System.out.println("e: "+ e);
        System.out.println("i: "+ i);
        System.out.println("o: "+ o);
        System.out.println("u: "+ u);

        return a+e+i+o+u;

    }

}
