package org.example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //calculadora de suma y resta
        Scanner teclado = new Scanner(System.in);
        boolean control =false;
        int opcion = 0;
        int numero1 = 0;
        int numero2= 0;
        int suma= 0;
        int resta= 0;
        System.out.println("Introduce la opcion que quieras (1-sumar, 2-Restar) ");
        do {
            try {
                opcion = teclado.nextInt();
                control=true;
            } catch (Exception e) {
                System.out.println("Introduce un número válido.");
            }
            teclado.nextLine();

        }while(control==false);
        System.out.println("coloca el numero 1");
        control =false;
        do {
            try {
                numero1 = teclado.nextInt();
                control=true;
            } catch (Exception e) {
                System.out.println("Introduce un número válido.");
            }
            teclado.nextLine();

        }while(control==false);
        System.out.println("coloca el numero 2");
        control =false;
        do {
            try {
                numero2 = teclado.nextInt();
                control=true;
            } catch (Exception e) {
                System.out.println("Introduce un número válido.");
            }
            teclado.nextLine();

        }while(control==false);


        control =false;
        do {
            switch (opcion){
                case 1:
                    System.out.println("Vamos a sumar los numeros");
                    control=true;
                    suma=numero1+numero2;
                    System.out.println("el resultado de la suma es:"+ suma);
                    break;

                case 2:
                    System.out.println("Vamos a restar los numeros");
                    control=true;
                    resta=numero1-numero2;
                    System.out.println("el resultado de la resta es:"+ resta);
                    break;
                default:
                    System.out.println("Elige bien la opcion");

            }
        }while(control==false);



    }
}
