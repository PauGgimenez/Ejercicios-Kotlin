package ejercicios.imperative

/* Nivel 1 — Rangos básicos

 1. Mostrar los números del 1 al 10
 Escribe un bucle que muestre por pantalla todos los números desde `1` hasta `10`, ambos incluidos.*/
fun ejercicio1() {
    for (i in 1..10) {
        print("$i ");
    }
}

/* 2. Mostrar los números del 5 al 15

Completa el rango para mostrar los números del `5` al `15`.
*/

fun ejercicio2() {
    for (i in 5..15) {
        println("$i ")
    }
}

/* 11. Utilizar `until` con `length`

Utiliza `until` y la propiedad `length` para recorrer todos los índices de la cadena.
*/

fun ejercicio_11() {
    val cadena = "Kotlin"
    for (i in 0 until cadena.length) {
        print(cadena[i]);
    }

}

/*18. Recorrer los índices de una lista

Dada la siguiente lista, muestra todos sus elementos utilizando sus índices. */

fun ejercicio18() {
    val numbers = listOf(10, 20, 30, 40, 50)
    for (n in numbers) {
        print("$n ")
    }


}

/* 20. ¿Qué construcción utilizarías?

Para cada situación, indica si utilizarías `..`, `until` o `..<`.

### A

Recorrer los números del `1` al `10`, incluyendo el `10`.
Usaria ..

### B

Recorrer los índices de una cadena.

until o ..<

### C

Recorrer los números del `0` al `99`, sin incluir el `100`.

until o ..<

### D

Recorrer los números del `10` al `20`, incluyendo el `20`
Usaria ..

.*/


/* 23. Cuenta atrás desde 100

Muestra todos los números desde `100` hasta `0`.*/

fun ejercicio23() {
    for (i in 100 downTo 0) {
        println("$i ")
    }
}

/* 27. De 10 en 10
Muestra los números desde `0` hasta `100`, avanzando de `10` en `10`.*/

fun ejercicio27() {
    for (i in 0..100 step 10) {
        println("$i ")
    }
}

/* 41. Recorrer una cadena hacia atrás

Utiliza `downTo` para mostrar los caracteres de la cadena en orden inverso.*/

fun ejercicio41() {
    val cadena = "Kotlin"
    for (i in cadena.length - 1 downTo 0) {
        print(cadena[i])
    }
}

/* 43. Mostrar caracteres en índices pares

Muestra únicamente los caracteres situados en índices pares.*/
fun ejercicio43() {
    val cadena = "Kotlin"
    for (i in 0..<cadena.length) {
        if (i % 2 == 0) {
            print(cadena[i])

        }

    }
}

fun ejercicio43v2() {
    val cadena = "Kotlin"
    for (i in 0..<cadena.length step 2) {

        print(cadena[i])

    }
}

/* 48. Recorrer una matriz
Dada una matriz de tres filas y cuatro columnas, utiliza `until` para recorrer todos sus elementos.*/
fun ejercicio48() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12)
    )
    for (f in 0 ..< matrix.size) {
        for (c in 0 ..< matrix[f].size) {
            print("${matrix[f][c]} ")
        }
        println()
    }

}
/* ## 51. Pirámide numérica

Utiliza un `for` con un rango para generar la siguiente salida:

```text
1
12
123
1234
12345
123456
1234567
12345678
123456789*/
fun ejercicio51() {


}
fun main() {
    ejercicio48()


}