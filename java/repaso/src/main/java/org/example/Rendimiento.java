package org.example;
import java.util.Scanner;

public class Rendimiento {

    public static int[] generarAfortunados(int n) {
        int[] v = new int[n];
        boolean[] activo = new boolean[n];

        for (int i = 0; i < n; i++) {
            v[i] = i + 1;
            activo[i] = true;
        }

        int activos = n;
        int posPaso = 1;

        while (true) {
            int paso = -1;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (activo[i]) {
                    if (count == posPaso) {
                        paso = v[i];
                        break;
                    }
                    count++;
                }
            }

            if (paso == -1 || paso > activos) break;

            int k = 0;
            for (int i = 0; i < n; i++) {
                if (activo[i]) {
                    k++;
                    if (k % paso == 0) {
                        activo[i] = false;
                        activos--;
                    }
                }
            }

            posPaso++;
        }

        int[] salida = new int[activos];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (activo[i]) salida[idx++] = v[i];
        }

        return salida;
    }

    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            String s = sc.nextLine();
            try {
                n = Integer.parseInt(s);
                if (n == 0) return 0;
                if (n >= 1 && n <= 10000) return n;
            } catch (Exception ignored) {}
        }
    }

    public static void main(String[] args) {
        while (true) {
            int n = leerNumero();
            if (n == 0) break;

            int[] resultado = generarAfortunados(n);

            System.out.print(n + ": ");
            for (int i = resultado.length - 1; i >= 0; i--) {
                System.out.print(resultado[i] + " ");
            }
            System.out.println();
        }
    }
}
