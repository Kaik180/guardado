package org.example;

import java.util.Scanner;


public class IFyTryCatch {
    public static void main(String[] args) {
        //programa para saber si eres mayor o menor de edad
        Scanner teclado = new Scanner(System.in);
        int edad=0;
        int numero=0;
        boolean control=false;

        System.out.println("Introduce tu edad");
        do {
            try {
                edad = teclado.nextInt();
                control=true;
            } catch (Exception e) {
                System.out.println("Introduce un número válido.");
            }
            teclado.nextLine();

        }while(control==false);

        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }

        System.out.println("Introduce tu numero 2");
        control=false;
        do {
            try {
                numero = teclado.nextInt();
                control=true;
            } catch (Exception e) {
                System.out.println("Introduce un número válido.");
            }
            teclado.nextLine();

        }while(control==false);
        if (numero>0){
            System.out.println("tu numero es positivo");
        }else if (0==numero){
            System.out.println("tu numero es cero");
        }else {
            System.out.println("tu numero es negativo");
        }



    }
}
