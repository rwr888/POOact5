


import java.util.Scanner;

public class ejer28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int v;
        boolean rango1a10, rango90a100, cumpleRangos;

        System.out.print("Ingrese un entero v: ");
        v = teclado.nextInt();

        rango1a10 = (v >= 1) && (v <= 10);
        rango90a100 = (v >= 90) && (v <= 100);
        cumpleRangos = rango1a10 || rango90a100;

        System.out.println("Pertenece a los rangos [1, 10] o [90, 100]: " + cumpleRangos);

        teclado.close();
    }
}



