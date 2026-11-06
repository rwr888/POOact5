



import java.util.Scanner;

public class ejer30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c;
        boolean esMayor50, unoEs0, condicionado;

        System.out.print("Ingrese el valor de a: ");
        a = teclado.nextInt();

        System.out.print("Ingrese el valor de b: ");
        b = teclado.nextInt();

        System.out.print("Ingrese el valor de c: ");
        c = teclado.nextInt();

        esMayor50 = ((a + b + c) / 3.0) >= 50.0;
        unoEs0 = (a == 0) || (b == 0) || (c == 0);
        condicionado = esMayor50 && unoEs0;

        System.out.println("Se cumple la condicion combinada: " + condicionado);

        teclado.close();
    }
}



