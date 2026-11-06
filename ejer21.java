

import java.util.Scanner;

public class ejer21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n;
        boolean enRango;

        System.out.print("Ingrese un numero: ");
        n = teclado.nextDouble();

        enRango = (n >= 10.0) && (n <= 50.0);

        System.out.println("El numero esta en el rango [10, 50]: " + enRango);

        teclado.close();
    }
}


