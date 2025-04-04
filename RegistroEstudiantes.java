import java.util.Scanner;
import java.util.Random;

class Estudiantes{
    String nombre;
    int edad;
    int matricula;
    String carrera;
}

public class Registro {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Estudiantes[] estudiantes = new Estudiantes[100];
        int numEstudiantes = 0;
        int op = 0;
        int flag = 0;

        do {
            System.out.println("---------- BIENVENIDO ----------");
            System.out.println("--- REGISTRO DE ESTUDIANTES ---");
            System.out.println("1.- Registrar estudiante");
            System.out.println("2.- Mostrar estudiantes");
            System.out.println("3.- Buscar estudiantes por matricula");
            System.out.println("4.- Eliminar estudiante");
            System.out.println("5.- Salir");
            System.out.println("Elija la opcion que guste...");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa...");
                    break;
                default:
                    System.out.println("Esa opcion no es valida...");
                    break;
            }

        } while (op != 5);

        scanner.close();
    }
public static void BuscarEstudiantePorMatricula(Scanner scanner, Estudiantes[] estudiantes, int numEstudiantes) {
        System.out.println("Ingrese la matricula del estudiante que desea buscar: ");
        int matriculaBuscada = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i] != null && estudiantes[i].matricula == matriculaBuscada) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].nombre);
                System.out.println("Edad: " + estudiantes[i].edad);
                System.out.println("Carrera: " + estudiantes[i].carrera);
                System.out.println("Matricula: " + estudiantes[i].matricula);
                return;
            }

        }
        System.out.println("No se encontró un estudiante con esa matrícula.");
    }
public static int EliminarEstudiante(Scanner scanner, int numEstudiantes, Estudiantes[] estudiantes) {
    if (numEstudiantes == 0) {
        System.out.println("No hay estudiantes registrados.");
        return numEstudiantes;
    }

    System.out.print("Ingrese la matrícula del estudiante a eliminar: ");
    
    if (!scanner.hasNextInt()) { 
        System.out.println("Error: Ingrese un número válido.");
        scanner.next();  
        return numEstudiantes;
    }
    
    int matriculaEliminar = scanner.nextInt();
    boolean eliminado = false;

    for (int i = 0; i < numEstudiantes; i++) {
        if (estudiantes[i].matricula == matriculaEliminar) {
            for (int j = i; j < numEstudiantes - 1; j++) {
                estudiantes[j] = estudiantes[j + 1]; 
            }
            estudiantes[numEstudiantes - 1] = null;  
            numEstudiantes--;  
            eliminado = true;
            System.out.println("Estudiante eliminado con éxito.");
            break;
        }
    }

    if (!eliminado) {
        System.out.println("Estudiante no encontrado.");
    }

    return numEstudiantes;  // Devuelve el nuevo número de estudiantes
}
 }
