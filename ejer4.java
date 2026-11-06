import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double bMayor, bMenor, h;
        double area;

        System.out.print("Ingrese la Base Mayor (bMayor): ");
        bMayor = teclado.nextDouble();

        System.out.print("Ingrese la Base Menor (bMenor): ");
        bMenor = teclado.nextDouble();

        System.out.print("Ingrese la Altura (h): ");
        h = teclado.nextDouble();

        area = ((bMayor + bMenor) * h) / 2.0;

        System.out.println("El área del trapecio es: " + area);

        teclado.close();
    }
}
