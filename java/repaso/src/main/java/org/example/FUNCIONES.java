package org.example;

public class FUNCIONES {
    //usar una funcion para calcular el area de un rectangulo
    //entre los parentesis hay que colocar el tipo de dato que va a recibir
    //Creamos la funcion
    public static double AREARECTANGULO(double base, double altura){
        double area= base*altura/2;

        return area; //la funcion siempre espera qe devuelvas algo en este caso el area, si pusieramos 3 nos daria un 3 en vez del valor del area
    }
    //y la usamos aqui
    public static void main(String[] args) {
        mostrarMenu();
        double base = 4;
        double altura= 2;
        double area = AREARECTANGULO(4,2);
        System.out.println("el area para un triangulo de base "+ base +" y altura "+ altura +" es: "+area);

    }

    //FUNCIÓN
    static double areaCuadrado(double lado){
        return lado*lado;
    }

    //FUNCIÓN
    static double perimetroCuadrado(double lado){
        return lado*4;
    }

    //PROCEDIMIENTO, no hace falta return porque lo unico que hara sera mostrar lo que tiene ese procedimiento(void) y se ira
    //detalles importante: puede cambiar valores
    static void mostrarMenu() {
        System.out.println("Esto es un método que muestra un menú");
        System.out.println("1 - Obtener área");
        System.out.println("2 - Obtener perímetro");
    }
}
