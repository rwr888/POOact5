

import java.util.Scanner;

public class ejer29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int id, nip;
        boolean es1234, es9999, identificado;

        System.out.print("Ingrese el identificador de usuario (id): ");
        id = teclado.nextInt();

        System.out.print("Ingrese el codigo NIP: ");
        nip = teclado.nextInt();

        es1234 = (id == 1234);
        es9999 = (nip == 9999);
        identificado = es1234 && es9999;

        System.out.println("Acceso autorizado: " + identificado);

        teclado.close();
    }
}



