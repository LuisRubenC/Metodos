# Gestor de Contactos en Java

## Descripción
Este código funciona como una agenda electróonica para contactos en la cual se incluyen las funciones necesarias para su operatividad.

## Características
- Definición de una clase Contacto con atributos: nombre, teléfono y correo.
- Creación de una lista dinámica ArrayList<Contacto> para almacenar los contactos.
- Lectura de opciones y datos del usuario utilizando la clase Scanner.
- Menú interactivo en consola con opciones para agregar, mostrar, buscar, eliminar, guardar y cargar contactos.
- Agregado de un nuevo contacto solicitando nombre, teléfono y correo al usuario.
- Impresión ordenada de todos los contactos almacenados en la lista.

## Requisitos
- Java 8 o superior.

## Instrucciones de Uso
1. Compilar el código:
   ```sh
   Gestor_Contactos.java
   ```
2. Ejecutar el programa:
   ```sh
   Gestor_Contactos
   ```
3. Seleccionar una opción del menú de la agenda.

## Ejemplo de Ejecución
```
--- Agenda de Contactos ---
1. Agregar Contacto
2. Mostrar Contactos
3. Buscar Contacto
4. Eliminar Contacto
5. Guardar Contactos y Salir
6. Cargar Contactos desde Archivo
Seleccione una opción: 1
Nombre: Ernesto López
Teléfono: 5589708066
Correo: ernesto.10pez@gmail.com
Contacto agregado correctamente.
```

# Comparación de Códigos - Gestor de Contactos en Java

## Similitudes
- Ambos programas implementan una agenda de contactos con opciones de agregar, mostrar, buscar y eliminar contactos.
- Se utiliza un menú interactivo en consola con una estructura repetitiva (do-while) para navegar entre opciones.
- Al inicio, ambos cargan automáticamente los contactos desde un archivo (contactos.txt).
- Se almacenan los datos de cada contacto: nombre, teléfono y correo.
- Los contactos se guardan en un archivo de texto al finalizar la ejecución.
- Se limita el número máximo de contactos a 100.

## Diferencias Clave
| Característica            | Java (Métodos)                                    | Primera versión en C                                 |
|----------------------------|------------------------------------------------|------------------------------------------------|
| Estructura de datos                 | Usa una clase `Contacto` y una `ArrayList`. | Usa una estructura struct y un arreglo fijo. |
| Almacenamiento dinámico | Lista dinámica que crece automáticamente. | Arreglo estático de tamaño 100 |
| Lectura de datos del usuario | Usa `Scanner` con `nextLine()` | Usa `fgets()` y limpia el salto de línea |
| Modularidad          | 	Más orientado a objetos y modular | Procedural y menos modular |
| Estilo de programación       | 	Orientado a objetos | Estructurado y procedural |

## Conclusión
Ambas versiones de la agenda de contactos cumplen la misma funcionalidad básica, pero difieren en su enfoque de implementación. El código en Java aprovecha características modernas como listas dinámicas, orientación a objetos y manejo de errores mediante excepciones, lo que lo hace más modular y escalable. En cambio, el código en C es más básico y estructurado, utilizando arreglos fijos y funciones procedurales, lo cual lo hace más directo pero menos flexible ante cambios o ampliaciones futuras.

# Juego de Adivinanza en Java

## Descripción
Este es un juego de adivinanza en el que el jugador debe adivinar un número aleatorio entre 1 y 100. El jugador tiene un máximo de 10 intentos para acertar el número.

## Características
- Generación de un número aleatorio entre 1 y 100.
- Entrada del usuario para adivinar el número.
- Indicaciones sobre si el número ingresado es mayor o menor que el objetivo.
- Un máximo de 10 intentos para acertar.
- Mensajes de felicitación si el usuario acierta o de derrota si no lo logra.

## Requisitos
- Java 8 o superior.

## Instrucciones de Uso
1. Compilar el código:
   ```sh
   JuegoAdivinanza.java
   ```
2. Ejecutar el programa:
   ```sh
   JuegoAdivinanza
   ```
3. Seguir las instrucciones en pantalla para introducir los números y tratar de adivinar el valor correcto.

## Ejemplo de Ejecución
```
¡Bienvenido al juego de adivinanza!
Debes adivinar un número entre 1 y 100.
Tienes 10 intentos. ¡Buena suerte!
Intento 1 de 10
Introduce un número: 50
El número es mayor. Intenta de nuevo.
...
Intento 5 de 10
Introduce un número: 73
¡Felicidades! Has adivinado el número.
```

# Comparación de Códigos - Juego de Adivinanza en Java

## Introducción
Este documento compara dos implementaciones del juego de adivinanza en Java. Ambas versiones permiten a un usuario adivinar un número aleatorio entre 1 y 100 en un máximo de 10 intentos.

## Similitudes
- Ambas versiones generan un número aleatorio entre 1 y 100.
- Se utiliza un `Scanner` para leer la entrada del usuario.
- Se permite un máximo de 10 intentos para adivinar el número.
- Se informa al usuario si el número ingresado es mayor o menor que el objetivo.
- Se verifica que la entrada del usuario sea válida.
- Se cierra el `Scanner` al final de la ejecución.

## Diferencias Clave
| Característica            | Métodos                                    | Primera versión                                  |
|----------------------------|------------------------------------------------|------------------------------------------------|
| Modularidad                 | Usa métodos separados para generar el número, obtener la entrada y verificar la adivinanza. | Lógica integrada en el `main`, sin separación en métodos. |
| Generación de número aleatorio | Método `generarNumeroAleatorio()` | Generación directa en `main` |
| Manejo de entrada de usuario | Método `obtenerEntrada()` con validación estructurada | Validación de entrada dentro del bucle principal |
| Control de intentos          | Se incrementa el contador solo cuando la entrada es válida | Se usa una variable `entradaValida` para controlar la incrementación de intentos |
| Estilo de programación       | Más estructurado y modular | Más compacto pero con lógica dentro del `main` |

## Conclusión
La versión por métodos del código es más modular, lo que facilita su mantenimiento y reutilización. La primera versión es más compacta pero menos organizada, ya que agrupa toda la lógica dentro del método `main`. Dependiendo del contexto, la versión por métodos puede ser preferible para proyectos más grandes, mientras que la primera podría ser adecuada para soluciones rápidas y sencillas.



# Sistema de Registro de Estudiantes en Java

## Descripción
Este es un sistema de registro de estudiantes desarrollado en Java. Permite registrar, buscar, mostrar y eliminar estudiantes almacenados en un arreglo de tamaño fijo.

## Características
- Registro de estudiantes con nombre, edad, matrícula y carrera.
- Búsqueda de estudiantes por matrícula.
- Eliminación de estudiantes del registro.
- Uso de un menú interactivo en la consola.

## Requisitos
- Java 8 o superior.

## Instrucciones de Uso
1. Compilar el código:
   ```sh
   SistemaRegistroEstudiantes.java
   ```
2. Ejecutar el programa:
   ```sh
   SistemaRegistroEstudiantes
   ```
3. Seguir las instrucciones en pantalla para agregar, buscar o eliminar estudiantes.

## Ejemplo de Ejecución
```
--- Sistema de Registro de Estudiantes ---
1. Registrar estudiante
2. Mostrar estudiantes
3. Buscar estudiante por matrícula
4. Eliminar estudiante
0. Salir
Seleccione una opción: 
```

# Comparación de Códigos - Registro de Estudiantes en Java

## Introducción
Este documento compara dos implementaciones de un sistema de registro de estudiantes en Java. Ambas versiones permiten gestionar estudiantes a través de un menú interactivo.

## Similitudes
- Ambas versiones permiten registrar, mostrar y eliminar estudiantes.
- Se utiliza un `Scanner` para la entrada del usuario.
- Se almacena la información de los estudiantes en un arreglo de tamaño fijo.
- Se usa un bucle `do-while` para gestionar el menú de opciones.
- Se cierran los recursos utilizados, como el `Scanner`.

## Diferencias Clave
| Característica             | Código en la Imagen                                  | Código Actual                                  |
|----------------------------|------------------------------------------------------|------------------------------------------------|
| Modularidad                | Lógica integrada en el `main`, sin separación en métodos. | Separa la lógica en métodos para mejor organización. |
| Manejo de entrada de usuario | Validación dentro del bucle principal.               | Validación más estructurada con mejor control de flujo. |
| Eliminación de estudiantes  | Implementada directamente en el `switch`.          | Modularizada para mejor legibilidad y reutilización. |
| Estilo de programación      | Más compacto pero con lógica dentro del `main`.    | Más estructurado y fácil de mantener. |

## Comparación de Casos en el Registro de Estudiantes
A continuación, se presentan algunos escenarios comunes en el uso del sistema de registro de estudiantes y cómo se comporta cada versión del código:

| Caso | Código en la Imagen | Código Actual |
|------|---------------------|--------------|
| Registro de un nuevo estudiante | Se almacena directamente en el arreglo sin verificación de duplicados. | Se puede mejorar con validación previa para evitar matrículas duplicadas. |
| Búsqueda de un estudiante existente | Se recorre el arreglo y se compara la matrícula sin optimización. | Se podría optimizar con estructuras más eficientes, como HashMap. |
| Eliminación de un estudiante | Se desplazan manualmente los elementos en el arreglo para llenar el espacio vacío. | Misma técnica, pero se puede mejorar con listas dinámicas para mayor eficiencia. |
| Lista de estudiantes vacía | No maneja casos específicos para mostrar mensajes adecuados. | Incluye una verificación para informar al usuario cuando no hay registros. |

## Conclusión
La versión del código es más compacta pero menos modular, ya que toda la lógica está dentro del `main`. En cambio, el código actual usa métodos separados, lo que facilita su mantenimiento y expansión. La versión modular es preferible para proyectos más grandes y escalables, mientras que la compacta es útil para soluciones rápidas y pequeñas aplicaciones de consola.

## Enlace a Microsoft Planner
`https://planner.cloud.microsoft/webui/plan/h9o-sLMBDUe98I5hrmKzPGQAApKT/view/grid?tid=f94bf4d9-8097-4794-adf6-a5466ca28563`
