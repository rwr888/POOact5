

import java.util.Scanner;

public class ejer23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anio;
        boolean esBisiestoBasico;

        System.out.print("Ingrese el ano: ");
        anio = teclado.nextInt();

        esBisiestoBasico = (anio % 4 == 0) && (anio % 100 != 0);

        System.out.println("Cumple la condicion basica de bisiesto: " + esBisiestoBasico);

        teclado.close();
    }
}

