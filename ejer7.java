import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double capitalInicial, interes, valorFuturo;

        System.out.print("Ingrese el capital inicial (c): ");
        capitalInicial = teclado.nextDouble();

        System.out.print("Ingrese la tasa de interes en decimal (i): ");
        interes = teclado.nextDouble();

        valorFuturo = capitalInicial * (1.0 + interes) * (1.0 + interes);

        System.out.println("El monto acumulado total es: " + valorFuturo);

        teclado.close();
    }
}
