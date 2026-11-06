import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x, y;
        double resultado;

        System.out.print("Ingrese el valor de x: ");
        x = teclado.nextDouble();

        System.out.print("Ingrese el valor de y: ");
        y = teclado.nextDouble();

        resultado = (x * x + 2 * x * y + y * y) / (x + y);

        System.out.println("El resultado de la expresión es: " + resultado);

        teclado.close();
    }
}
