

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        boolean esMayor;

        System.out.print("Ingrese la edad: ");
        edad = teclado.nextInt();

        esMayor = edad >= 18;

        System.out.println("Es mayor de edad: " + esMayor);

        teclado.close();
    }
}

