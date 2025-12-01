package org.example;

import java.util.Scanner;

public class trabajarCadenas2Ej {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean control = false;
        String numero = String.valueOf(0);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        final int REQUISITOTAMANYO= 10;
        final int MAXDIAS= 31;
        final int MINDIAS= 1;
        final int MAXMES= 12;
        final int MINMES= 1;
        final int MAXANYO= 2025;
        final int MINANYO= 1930;
        final String SEPARADOR= "-";
        // constantes y variables que tenemos que definir


        System.out.println("insertar numero en el siguiente formato dd-mm-aaaa (se tienen que poner ceros)");
        numero = teclado.nextLine(); //pedimos el numero
        System.out.println(numero);
        int tamanyo = numero.length();
        if (tamanyo==REQUISITOTAMANYO){ //comprobamos el tamanyo para ver que lo entrega en buen formato
            String trozo_1 = numero.substring(0,2);
            String trozo_2 = numero.substring(3,5);
            String trozo_3 = numero.substring(6,10);
            String linea1 =  numero.substring(2,3);
            String linea2 =  numero.substring(5,6); // separamos la fecha en numeros y las lineas
            try {
                numero1 = Integer.parseInt(trozo_1);
                numero2 = Integer.parseInt(trozo_2);
                numero3 = Integer.parseInt(trozo_3); //convertimos los numeros de las fechas en int para poder usarlos

            }catch (Exception e){
                System.out.println("Error: no se puede convertir a número, formato mal colocado (no coloques letras)");
                return;
            }



            if (numero1>MAXDIAS){ //comprobamos que los numeros que hemos conseguido y separado sean correctos y reales en el formato que lo pedimos
                System.out.println("Error: El numero de dias no puede ser mayor a 31");
            }else if (numero1<MINDIAS){
                System.out.println("Error: El numero de dias no puede ser menor a 1");
            }else{
                if (numero2>MAXMES){
                    System.out.println("Error: El numero de meses no puede ser mayor a 12");
                }else if(numero2<MINMES){
                    System.out.println("Error: El numero de meses no puede ser menor a 1");
                }else {
                    if (numero3<MINANYO){
                        System.out.println("Error: El numero de año es menor a 1930");

                    }else if (numero3>MAXANYO){
                        System.out.println("Error: El numero de año es mayor a 2025");
                    }else{
                        if (linea1.equals(SEPARADOR)){ //comprobamos los separadores que sean lineas
                            if (linea2.equals(SEPARADOR)){
                                System.out.println("todo correcto"); //una vez llegado a este punto hemos comprobado que sea correcto por completo el formato y procedemos a operar para sacar el numero de la suerte
                                int resultado= numero1 + numero2 + numero3; //sumamos las 3 fechas (dias, meses, año)
                                String resultado2= String.valueOf(resultado);

                                String parte_1 = resultado2.substring(0,1);
                                String parte_2 = resultado2.substring(1,2);
                                String parte_3 = resultado2.substring(2,3);
                                String parte_4 = resultado2.substring(3,4);
                                int suerte1 = Integer.parseInt(parte_1);
                                int suerte2= Integer.parseInt(parte_2);
                                int suerte3= Integer.parseInt(parte_3);
                                int suerte4= Integer.parseInt(parte_4);
                                int numerodesuerte = suerte1 + suerte2 + suerte3 + suerte4; //separamos el resultado de la suma en numeros para luego sumarlos y obtener el numero de la suerte

                                System.out.println(resultado+ " = " + numero1 + " + " + numero2 + " + " +  numero3 );

                                System.out.println(numerodesuerte+ " = " + suerte1 + " + " + suerte2 + " + " +  suerte3 + " + " + suerte4 );
                                System.out.println("tu numero de la suerte es: " + numerodesuerte); //mostramos y imrpimimos por pantalla lo que hemos hecho, como lo sumamnos y el resultado que da



                            }else {
                                System.out.println("Error: formato mal colocado la segunda linea");
                            }
                        }else {
                            System.out.println("Error: formato mal colocado la primera linea");
                        }
                    }
                }
            }

        }else {
            System.out.println("Error: El formato no esta bien colocado");

        }
    }
}
