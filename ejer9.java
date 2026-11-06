

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double b, h;
        double perimetro, area;

        System.out.print("Ingrese la base (b): ");
        b = teclado.nextDouble();

        System.out.print("Ingrese la altura (h): ");
        h = teclado.nextDouble();

        perimetro = 2 * b + 2 * h;
        area = b * h;

        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);

        teclado.close();
    }

}
