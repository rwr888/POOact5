import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int totalSegundos, minutos, segundosSobrantes;
        
        System.out.print("Ingrese la cantidad total de segundos: ");
        totalSegundos = teclado.nextInt();
        
        minutos = totalSegundos / 60;
        segundosSobrantes = totalSegundos % 60;
        
        System.out.println(totalSegundos + " segundos equivalen a " + minutos + " minutos y " + segundosSobrantes + " segundos.");
        
        teclado.close();
    }
}


