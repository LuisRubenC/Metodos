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
   javac JuegoAdivinanza.java
   ```
2. Ejecutar el programa:
   ```sh
   java JuegoAdivinanza
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

