

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c, x, resultado;

        System.out.print("Ingrese el coeficiente a: ");
        a = teclado.nextDouble();

        System.out.print("Ingrese el coeficiente b: ");
        b = teclado.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        c = teclado.nextDouble();

        System.out.print("Ingrese el valor de x: ");
        x = teclado.nextDouble();

        resultado = (a * x * x) + (b * x) + c;

        System.out.println("El resultado del polinomio es: " + resultado);

        teclado.close();
    }
}



