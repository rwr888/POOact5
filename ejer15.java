

import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c, discriminante;
        boolean esMayorIgualCero;

        System.out.print("Ingrese el coeficiente a: ");
        a = teclado.nextDouble();

        System.out.print("Ingrese el coeficiente b: ");
        b = teclado.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        c = teclado.nextDouble();

        discriminante = (b * b) - (4.0 * a * c);
        esMayorIgualCero = discriminante >= 0;

        System.out.println("El discriminante es: " + discriminante);
        System.out.println("Es mayor o igual a cero: " + esMayorIgualCero);

        teclado.close();
    }
}

