


import java.util.Scanner;

public class ejer27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        boolean mayor0, esPar, condicionado;

        System.out.print("Ingrese un numero entero: ");
        num = teclado.nextInt();

        mayor0 = num > 0;
        esPar = num % 2 == 0;
        condicionado = mayor0 && esPar;

        System.out.println("Es un numero positivo y par: " + condicionado);

        teclado.close();
    }
}


