package ejercicios.imperative

// Nivel 1 - Salida por consola
fun nivel1() {
    // Ejercicio 1 - Primer mensaje
    print("Hola, mundo")
// Ejercicio 2 - Varias líneas
    println("Nombre: Carlos")
    println("Edad: 25")
    println("Ciudad: Madrid")
// Ejercicio 3 — Una sola línea
    println("Kotlin es un lenguaje de programación")
// Ejercicio 4 — Varias llamadas
    println("Hola")
    println("Me llamo Carlos")
    println("Estoy aprendiendo Kotlin")
// Ejercicio 5 — `print()` frente a `println()`
    print("Hola ")
    println("Carlos")
    println("Bienvenido")
}

// ------------ NIVEL 2 ------------
fun ejercicio6() { // Leer un nombre
    println("Dame tu nombre")
    val nombre = readln();
    println("Hola como estas, $nombre")
    //  println("Hola como estas, " + nombre)
}

fun ejercicio7() {
    println("Donde vives:")
    val ciudad = readln()
    println("Vives en $ciudad")
}

fun ejercicio8y9y10() {
    println("Nombre: ")
    val nombre = readln()
    println("Ciudad: ")
    val ciudad = readln()
    println("Profesion: ")
    val profesion = readln()
    println("Te llamas $nombre, vives en $ciudad y tu profesion es $profesion")

}

// ------------ NIVEL 3 ------------
fun ejercicio11() {
    println("Dame un numero: ")
    val numero = readln().toInt()
    println("El numero es $numero")
}

fun ejercicio12() { // Leer enteros
    println("Dame un numero: ")
    val numero = readln().toInt()
    println("Dame otro: ")
    val numero2 = readln().toInt()
    println("La suma de los números es: ${numero + numero2}")
}

fun ejercicios13y14y15y16() { // Calculadora
    println("Dame un numero: ")
    val numero = readln().toInt()
    println("Dame otro: ")
    val numero2 = readln().toInt()
    println("La suma de los números es: ${numero + numero2}")
    println("La resta de los números es: ${numero - numero2}")
    println("La multiplicación de los números es: ${numero * numero2}")
    println("La división de los números es: ${numero / numero2}")
}

// ------------ NIVEL 4 ------------

fun ejercicio18y19() { // Edad
    println("Dime tu edad: ")
    var edad = readln().toInt()
    edad++
    println("El proximo año tendrás $edad años")
}

fun ejercicio20() {
    println("Dime tu edad: ")
    var edad = readln().toInt()
    edad += 10
    println("El proximo año tendrás $edad años")
}

fun ejercicio21() {
    println("Dime un numero decimal: ")
    var edad = readln().toDouble()
    print("Tu numero es $edad")
}


// NO HE SEGUIDO PORQUE SON REPITITIVOS y FACILES

fun main() {

    ejercicio21()
}
