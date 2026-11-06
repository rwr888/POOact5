import java.util.Scanner; 

public class ejer1 { 
    public static void main(String[] args) { 
        
        Scanner teclado = new Scanner(System.in);
        
        double n1, n2, n3;
        double promedio;
        
        System.out.print("Ingrese la primera calificación (20%): ");
        n1 = teclado.nextDouble();
        
        System.out.print("Ingrese la segunda calificación (30%): ");
        n2 = teclado.nextDouble();
        
        System.out.print("Ingrese la tercera calificación (50%): ");
        n3 = teclado.nextDouble();
        
        promedio = n1 * 0.20 + n2 * 0.30 + n3 * 0.50;
        
        System.out.println("----------------------------------------");
        System.out.println("El promedio ponderado final es: " + promedio);
        System.out.println("----------------------------------------");
        
        teclado.close();
    }
}
