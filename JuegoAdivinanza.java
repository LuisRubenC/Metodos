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

        while (intentos < maxIntentos && !adivinado) {
            int numeroUsuario = obtenerEntrada(scanner);
            adivinado = verificarNumero(numeroUsuario, numeroAleatorio);
            intentos++;
            if (!adivinado) {
                System.out.println("Intentos restantes: " + (maxIntentos - intentos));
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, has agotado tus intentos. El número era: " + numeroAleatorio);
        }
        scanner.close();
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
    

    public static boolean verificarNumero(int numeroUsuario, int numeroAleatorio) {
        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Felicidades! Has adivinado el número.");
            return true;
        } else if (numeroUsuario < numeroAleatorio) {
            System.out.println("El número es mayor. Inténtalo de nuevo.");
        } else {
            System.out.println("El número es menor. Inténtalo de nuevo.");
        }
        return false;
    }

}

