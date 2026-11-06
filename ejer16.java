

import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double compra, limDeCredito;
        boolean excede;

        System.out.print("Ingrese el monto de la compra: ");
        compra = teclado.nextDouble();

        System.out.print("Ingrese el limite de credito: ");
        limDeCredito = teclado.nextDouble();

        excede = compra > limDeCredito;

        System.out.println("La compra excede el limite: " + excede);

        teclado.close();
    }
}

