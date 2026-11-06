import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double m, v, energiaCin;

        System.out.print("Ingrese la masa en kg (m): ");
        m = teclado.nextDouble();

        System.out.print("Ingrese la velocidad en m/s (v): ");
        v = teclado.nextDouble();

        energiaCin = (m * v * v) / 2.0;

        System.out.println("La energía cinética es: " + energiaCin + " Joules");

        teclado.close();
    }
}
