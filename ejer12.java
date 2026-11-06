

import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        boolean esPar;

        System.out.print("Ingrese un numero entero: ");
        numero = teclado.nextInt();

        esPar = numero % 2 == 0;

        System.out.println("El numero es par: " + esPar);

        teclado.close();
    }
}

