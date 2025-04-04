import java.io.*;
import java.util.*;

class Contacto {
    String nombre;
    String telefono;
    String correo;

    Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
}

public class AgendaContactos {
    static List<Contacto> contactos = new ArrayList<>();
    static final String ARCHIVO = "contactos.txt";

    public static void main(String[] args) {
        cargarContactos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Agenda de Contactos ---");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Mostrar Contactos");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Guardar Contactos y Salir");
            System.out.println("6. Cargar Contactos desde Archivo");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: agregarContacto(scanner); break;
                case 2: mostrarContactos(); break;
                case 3: buscarContacto(scanner); break;
                case 4: eliminarContacto(scanner); break;
                case 5: guardarContactos(); System.out.println("Contactos guardados. Saliendo..."); break;
                case 6: cargarContactos(); System.out.println("Contactos cargados desde el archivo."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
static void cargarContactos() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("No se encontró un archivo de contactos.");
            return;
        }

        contactos.clear();
        try (Scanner scanner = new Scanner(archivo)) {
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(" - ");
                if (datos.length == 3) {
                    contactos.add(new Contacto(datos[0], datos[1], datos[2]));
                }
            }
            System.out.println("Contactos cargados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al cargar los contactos.");
        }
    }
}
