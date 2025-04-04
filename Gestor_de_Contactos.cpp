#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char nombre[50];
    char telefono[15];
    char correo[50];
} Contacto;

Contacto contactos[100];
int totalContactos = 0;

void guardarContactos();
void cargarContactos();
void agregarContacto();
void mostrarContactos();
void buscarContacto();
void eliminarContacto();

int main() {
    int opcion;
    cargarContactos();  // Cargar contactos al inicio automáticamente

    do {
        printf("\n--- Agenda de Contactos ---\n");
        printf("1. Agregar Contacto\n");
        printf("2. Mostrar Contactos\n");
        printf("3. Buscar Contacto\n");
        printf("4. Eliminar Contacto\n");
        printf("5. Guardar Contactos y Salir\n");
        printf("6. Cargar Contactos desde Archivo\n");
        printf("Seleccione una opcion: ");
        scanf("%d", &opcion);
        getchar();  // Limpiar buffer de entrada

        switch(opcion) {
            case 1: agregarContacto();    
                break;
            case 2: mostrarContactos(); 
                break;
            case 3: buscarContacto(); 
                break;
            case 4: eliminarContacto(); 
                break;
            case 5: guardarContactos(); printf("Contactos guardados. Saliendo...\n"); 
                break;
            case 6: cargarContactos(); printf("Contactos cargados desde el archivo.\n"); 
                break;
            default: printf("Opcion no valida.\n");
        }
    } while (opcion != 5);

    return 0;
}
