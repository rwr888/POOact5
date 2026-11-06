

import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double val1, val2;
        boolean distinto;

        System.out.print("Ingrese el primer valor decimal: ");
        val1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo valor decimal: ");
        val2 = teclado.nextDouble();

        distinto = val1 != val2;

        System.out.println("Los valores son distintos: " + distinto);

        teclado.close();
    }
}


