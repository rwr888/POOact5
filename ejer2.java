import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double c;
        double fahrenheit;

        System.out.print("Ingrese la temperatura en grados Celsius (°C): ");
        c = teclado.nextDouble();

        fahrenheit = (c * (9.0 / 5.0)) + 32.0;

        System.out.println("----------------------------------------");
        System.out.println("La temperatura equivalente en Fahrenheit es: " + fahrenheit + " °F");
        System.out.println("----------------------------------------");

        teclado.close();
    }
}