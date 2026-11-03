package ejercicios.imperative

/* ---------- Ejercicio 1 ---------- */
// Dada esta función:
fun showPerson(name: String, age: Int) {
    println("$name is $age years old")
}
/*
Realiza una llamada que muestre:
Laura is 25 years old
*/

/* ---------- Ejercicio 2 ---------- */
// Dada:
fun add(first: Int, second: Int) {
    println(first + second)
}
/* Realiza una llamada que muestre:
              35
*/


/* ============== NIVEL 2 ============*/
/* 3. Argumentos con nombre

Kotlin permite indicar explícitamente el nombre del parámetro:

showPerson(
    name = "Laura",
    age = 25
)
*/

/* ---------- Ejercicio 9 ---------- */
/* Dada la funcion showPerson del ejercicio 1, Realiza la misma llamada del ejercicio 1,
pero utilizando argumentos con nombre.*/

/* ============== NIVEL 3 ============*/
// Cambiar el orden mediante argumentos con nombre

/* Una ventaja importante de los argumentos con nombre es que permiten
indicar explícitamente qué valor corresponde a cada parámetro.*/

fun main() {
    // Ejercicio 1
    showPerson("Laura", 25);
    // Ejercicio 2
    add(30, 5)
    // Ejercicio 9
    showPerson(name = "Laura", age = 25)
    // Ejercicio 13
    showPerson(age = 25, name = "Laura")

}