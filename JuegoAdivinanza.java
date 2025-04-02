import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; 
        Scanner scanner = new Scanner(System.in); 
        int intentos = 0;
        int maxIntentos = 10;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Debes adivinar un número entre 1 y 100.");
        System.out.println("Tienes " + maxIntentos + " intentos. ¡Buena suerte!");
    }
    
    public static int obtenerEntrada(Scanner scanner) {
        int numero;
        while (true) {
            System.out.print("Introduce un número: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= 1 && numero <= 100) {
                    return numero; 
                } else {
                    System.out.println("Número fuera de rango. Introduce un número entre 1 y 100.");
                }
            } else {
                System.out.println("Error: Entrada no válida. Ingresa un número entre 1 y 100.");
                scanner.next(); 
            }
        }
}
