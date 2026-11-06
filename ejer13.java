

import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        boolean esMultiplo;

        System.out.print("Ingrese un numero entero: ");
        numero = teclado.nextInt();

        esMultiplo = numero % 5 == 0;

        System.out.println("Es multiplo de 5: " + esMultiplo);

        teclado.close();
    }
}


