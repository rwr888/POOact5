

import java.util.Scanner;

public class ejer18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x;
        boolean esCero;

        System.out.print("Ingrese el valor de x: ");
        x = teclado.nextDouble();

        esCero = (3.0 * x) - 12.0 == 0.0;

        System.out.println("El resultado de 3x - 12 es igual a cero: " + esCero);

        teclado.close();
    }
}


