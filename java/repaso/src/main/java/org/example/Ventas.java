package org.example;

import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] ganancias = recaudacion();
        String diaMejor=ventas(ganancias);
        System.out.print("El dia que mas dinero se ha conseguido a sido: "+ diaMejor);
        System.out.print("la media de la semana a sido: "+ media(ganancias));
        System.out.print("la ganancia del domingo fue: "+ Domingo(ganancias));
        double Domingo= Domingo(ganancias);
        if (Domingo>media(ganancias)){
            System.out.print("Si");
        }else{
            System.out.print("No");
        }




    }
    public static double[] recaudacion(){
        Scanner teclado = new Scanner(System.in);
        double numeros[] = new double[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dia" + (i) + ": ");
            numeros[i] = teclado.nextDouble();
        }
        return numeros;
    }
    public static String ventas(double[] ganancias){
            double posicion = 0;
        double max = ganancias[0];
        for (int i = 1; i < ganancias.length; i++) {
            if (ganancias[i] > max) {
                max = ganancias[i];
                posicion=i;
            }
        }
        int valorInt = (int) posicion;
        String dia="";
        switch (valorInt){
            case 0:
                dia = "martes";
                break;

            case 1:
                dia = "miercoles";
                break;

            case 2:
                dia = "jueves";
                break;

            case 3:
                dia = "viernes";
                break;

            case 4:
                dia = "sabado";
                break;

            case 5:
                dia = "domingo";
                break;
        }
        return dia;
    }
    public static double media(double[] ganancia){
        double acumulado= 0;
        for (int i=0; i < ganancia.length ;i++){
          acumulado += ganancia[i];
        }
        return (acumulado/ganancia.length);
    }
    public static double Domingo(double[] ganancia){
        return ganancia[ganancia.length-1];
    }
}
