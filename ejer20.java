


import java.util.Scanner;

public class ejer20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double prom;
        boolean esDeficiente;

        System.out.print("Ingrese el promedio: ");
        prom = teclado.nextDouble();

        esDeficiente = prom < 6.0;

        System.out.println("La calificacion esta por debajo del minimo: " + esDeficiente);

        teclado.close();
    }
}



