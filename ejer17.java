

import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, producto, suma;
        boolean esMenorASum;

        System.out.print("Ingrese el valor de a: ");
        a = teclado.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        b = teclado.nextDouble();

        producto = a * b;
        suma = a + b;
        esMenorASum = producto < suma;

        System.out.println("El producto es: " + producto);
        System.out.println("La suma es: " + suma);
        System.out.println("El producto es menor que la suma: " + esMenorASum);

        teclado.close();
    }
}


