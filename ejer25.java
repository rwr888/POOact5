
import java.util.Scanner;

public class ejer25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota, asistencia;
        boolean aprobado;

        System.out.print("Ingrese la nota final: ");
        nota = teclado.nextDouble();

        System.out.print("Ingrese el porcentaje de asistencia (0 a 100): ");
        asistencia = teclado.nextDouble();

        aprobado = (nota >= 70.0) && (asistencia >= 80.0);

        System.out.println("El alumno esta aprobado: " + aprobado);

        teclado.close();
    }
}


