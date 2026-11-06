
import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c;
        double resultado;

        System.out.print("Ingrese el valor entero de a: ");
        a = teclado.nextInt();

        System.out.print("Ingrese el valor entero de b: ");
        b = teclado.nextInt();

        System.out.print("Ingrese el valor entero de c: ");
        c = teclado.nextInt();

        resultado = (a + (b * c)) - ((double) a / b) + (b % c);

        System.out.println("El resultado de la ecuacion jerarquizada es: " + resultado);

        teclado.close();
    }
}

