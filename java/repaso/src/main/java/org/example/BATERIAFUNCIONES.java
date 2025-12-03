package org.example;

import java.util.Scanner;

public class BATERIAFUNCIONES {
    public static void main(String[] args) {
        //Ejercicio 1 Calcular al cubo

       int numero = PEDIRNUMERO();
       CUBO(numero);
       System.out.println("el cubo del numero que me has pasado es: ");
       //como pintar X numero de nombres
        PINTAR_NOMBRE("patri","kevin");

    }
    public static int PEDIRNUMERO( ){
        Scanner Teclado = new Scanner(System.in);
        System.out.println("introduce un numero...");
        int numero = Teclado.nextInt();
        return numero;

    }
    public static int CUBO(int numero){
            int cubo;
        return cubo=numero*numero*numero;
    }

    //Para cuando no sepa cuantos datos me van a pasar para la funcion se hace lo siguiente (supuesto caso donde me van a mandar nombres)
    // ... = para momentos variables (es un vector o al menos se comporta asi)
    // el ... tiene que ir lo mas a la izquierda o saldra error y solo podra haber 1
    public  static  void PINTAR_NOMBRE(String... nombre){
        for (String nom : nombre){
            System.out.println(nom);
        }

    }

}
