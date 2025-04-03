import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; 
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int maxIntentos = 10;
        int numeroUsuario = 0;
        boolean adivinado = false;
        boolean entradaValida = false;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Debes adivinar un número entre 1 y 100.");
        System.out.println("Tienes 10 intentos. ¡Buena suerte!");
        
        while (intentos < maxIntentos) {
            System.out.println("Intento " + (intentos + 1) + " de " + maxIntentos);
            int numeroUsuario = obtenerEntrada(scanner);

            intentos++; 

            if (verificarNumero(numeroUsuario, numeroAleatorio)) {
                System.out.println("Has adivinado el número en " + intentos + " intentos.");
                adivinado = true;
                break;
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, has agotado tus intentos. El número era " + numeroAleatorio);
        }

        scanner.close();
    }


 }
    public static boolean verificarNumero(int numeroUsuario, int numeroAleatorio) {
        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Felicidades! Has adivinado el número.");
            return true;
        } else if (numeroUsuario < numeroAleatorio) {
            System.out.println("El número es mayor. Intenta de nuevo.");
        } else {
            System.out.println("El número es menor. Intenta de nuevo.");
        }
        return false;
    }
}
