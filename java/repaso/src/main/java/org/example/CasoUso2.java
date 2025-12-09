package org.example;

import java.util.Scanner;

public class CasoUso2 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        while (casoDePrueba()) {

        }
    } // main


        public static boolean casoDePrueba() {
            Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        int y = teclado.nextInt();
        teclado.nextLine();
            if (x <0 || y < 0)
            return false;
        else {
                System.out.println((x+y)*2);
                return true;
            }
        } // casoDePrueba


}
