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
}
