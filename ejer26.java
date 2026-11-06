

import java.util.Scanner;

public class ejer26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        double compra;
        boolean descto;

        System.out.print("Ingrese la edad del cliente: ");
        edad = teclado.nextInt();

        System.out.print("Ingrese el monto de compra: ");
        compra = teclado.nextDouble();

        descto = (edad >= 60) || (compra >= 1000.0);

        System.out.println("Obtiene descuento promocional: " + descto);

        teclado.close();
    }
}



