

import java.util.Scanner;

public class ejer19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2;
        boolean esMayor;

        System.out.print("Ingrese el primer entero n1: ");
        n1 = teclado.nextInt();

        System.out.print("Ingrese el segundo entero n2: ");
        n2 = teclado.nextInt();

        esMayor = (n1 - n2) >= 100;

        System.out.println("La diferencia alcanza o supera los 100: " + esMayor);

        teclado.close();
    }
}


