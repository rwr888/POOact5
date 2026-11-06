


import java.util.Scanner;

public class ejer24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c;
        boolean valido;

        System.out.print("Ingrese el lado a: ");
        a = teclado.nextDouble();

        System.out.print("Ingrese el lado b: ");
        b = teclado.nextDouble();

        System.out.print("Ingrese el lado c: ");
        c = teclado.nextDouble();

        valido = (a + b > c) && (b + c > a) && (c + a > b);

        System.out.println("El triangulo es valido: " + valido);

        teclado.close();
    }
}



