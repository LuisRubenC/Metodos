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



 }
     public static int generarNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(100) + 1; 
    }

    
    
}
