


import java.util.Scanner;

public class ejer22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x;
        boolean fueraDeRango;

        System.out.print("Ingrese un valor para x: ");
        x = teclado.nextDouble();

        fueraDeRango = (x < 0.0) || (x > 100.0);

        System.out.println("El numero esta fuera del rango de 0 a 100: " + fueraDeRango);

        teclado.close();
    }
}


