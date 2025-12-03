package org.example;

import java.util.Scanner;

public class FUNCIONMENU {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        mostrarMenu();
        char opcion = teclado.next().charAt(0);
        if (validarOpcion(opcion)){
            System.out.println("valida");
        }else{
            System.out.println("No valida");
        }

    }
    static void mostrarMenu() {
        System.out.println("Bienvenido!");
        System.out.println("1 - Cantar");
        System.out.println("2 - bailar");
        System.out.println("3 - hacer backflip");
        System.out.println("X - Salir");
    }
    public static boolean validarOpcion(char opcion){
        switch(opcion){
            case '1':
            case '2':
            case '3':
            case 'X':
                return true;
            default:
                return false;

        }
    }
}
