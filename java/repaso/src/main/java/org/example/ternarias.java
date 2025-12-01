package org.example;

public class ternarias {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        boolean condicion = a == 1 ? true : false;

        if (condicion) System.out.println("a vale 1");
        else System.out.println("a no vale 1");

        condicion = a == 3 ? true :
                b == 3 ? true :
                        c == 3 ? true : false;

        if (condicion) System.out.println("Alguna variable vale 3");
        else System.out.println("Ninguna variable vale 3");

        a = a != 0 ? 2 : 3; //a vale 2

        b = a == c ? 2 : 1; //b vale 1
    }
}
