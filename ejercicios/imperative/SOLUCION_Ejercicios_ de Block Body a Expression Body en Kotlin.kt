package ejercicios.imperative

import kotlin.text.compareTo

/* ========== NIVEL 1 - Expresiones sencillas ============= */
/* Transforma cada función para que utilice expression body. */
// --------- 1. Duplicar un número --------------
fun double(number: Int): Int {       // Block body
    return number * 2
}


fun doubleExBody(number: Int): Int = number * 2  // Expression body

// -------------- 2. Calcular el cuadrado --------------
fun square(number: Int): Int {  // Block body
    return number * number
}

fun squareEx(number: Int): Int = number * number // Expression body

// 3 -------------- 3. Saludar --------------
fun greet(name: String): String { // Block body
    return "Hola, $name"
}

fun greetExBody(name: String): String = "Hola, $name" // Expression body

/* ================== Nivel 2 — Expresiones condicionales ============================== */
/* Transforma cada función para que utilice expression body. */
// -------------- 6. Obtener el mayor de dos números ----------------------
fun max(a: Int, b: Int): Int { // Block body
    return if (a > b) {
        a
    } else {
        b
    }
}

fun maxExBody(a: Int, b: Int): Int = if (a > b) a else b // Expression body

// -------------- 7. Comprobar si una persona puede votar ----------------------

fun canVote(age: Int): Boolean {
    return if (age >= 18) {
        true
    } else {
        false
    }
}

fun canVOteExBody(age: Int): Boolean = if (age >= 18) true else false

// -------------- 9. Determinar el signo de un número ----------------------

fun sign(number: Int): String {
    return if (number > 0) {
        "positivo"
    } else if (number < 0) {
        "negativo"
    } else {
        "cero"
    }
}

fun signExBody(number: Int): String = if (number > 0) "positivo" else if (number < 0) "negativo" else "cero"

/* =============== Nivel 3 — Expresiones when ============== */
// ----------- 10. Obtener el nombre de un día -----------
fun dayName(day: Int): String { // BLOCK BODY
    return when (day) {
        1 -> "lunes"
        2 -> "martes"
        3 -> "miércoles"
        4 -> "jueves"
        5 -> "viernes"
        6 -> "sábado"
        7 -> "domingo"
        else -> "día inválido"
    }
}

fun dayExBody(day: Int): String = when (day) { //EXPRESSION BODY
    1 -> "lunes"
    2 -> "martes"
    3 -> "miércoles"
    4 -> "jueves"
    5 -> "viernes"
    6 -> "sábado"
    7 -> "domingo"
    else -> "día inválido"
}

// ------------------- 11. Clasificar una edad ------------------
fun classifyAge(age: Int): String {
    return when {
        age < 13 -> "niño"
        age < 18 -> "adolescente"
        age < 65 -> "adulto"
        else -> "mayor"
    }
}

fun classifyAgeExBody(age: Int): String = when { // EXPRESSIN BODY
    age < 13 -> "niño"
    age < 18 -> "adolescente"
    age < 65 -> "adulto"
    else -> "mayor"

}

/* =================== Nivel 4 — Inferencia de tipos ============================= */
/* Convierte las funciones a expression body.

Además, comprueba si puedes eliminar el tipo de retorno utilizando la inferencia de tipos de Kotlin. */

// ---------- Ejercicio 13 ----------
fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun multiplyExBody(a: Int, b: Int): Int = a * b

fun multiplyExBody2(a: Int, b: Int) = a * b


// ---------- Ejercicio 14 ----------

fun getMessage(): String {
    return "Hola, Kotlin"
}

fun getMessageExBody(): String = "Hola, Kotlin"

fun getMessageEx2Body() = "Hola, Kotlin"

// ---------- Ejercicio 15 ----------
fun isPositive(number: Int): Boolean {
    return number > 0
}

fun isPositiveExBody(number: Int) = number > 0

// ---------- Ejercicio 16 ----------
fun calculatePrice(price: Double, discount: Double): Double {
    return price - price * discount
}

fun calculatePriceExBody(price: Double, discount: Double) = price - price * discount


/* ================== Nivel 5 — Varias sentencias ==================== */
/* En estos ejercicios hay más de una sentencia dentro del cuerpo.

Intenta convertirlos a Bodypression body siempre que sea posible.*/

// -------- Ejercicio 17--------

fun calculateTriangleArea(base: Double, height: Double): Double {
    val area = base * height
    return area / 2
}

fun calculateTriangleAreaExBody(base: Double, height: Double) = (base * height) / 2

// --------Ejercicio 18 --------
fun getFullName(firstName: String, lastName: String): String {
    val result = "$firstName $lastName"
    return result
}

fun getFullNameExBody(firstName: String, lastName: String): String = "$firstName $lastName"

// -------- Ejercicio 19 --------

fun calculateTotal(price: Double, quantity: Int): Double {
    val subtotal = price * quantity
    return subtotal + subtotal * 0.21
}

fun calculateTotalExBody(price: Double, quantity: Int): Double = price * quantity + price * quantity * 0.21

// -------- Ejercicio 20 --------

fun isAdult(age: Int): Boolean {
    val minimumAge = 18
    return age >= minimumAge
}

fun isAdultExBody(age: Int): Boolean = age >= 18

/* ============= Nivel 6 — ¿Es posible convertirla ===============

En estos ejercicios debes decidir si la función puede convertirse directamente a expression body.

Si es posible, realiza la conversión.

Si no es posible, explica por qué. */

// -------- Ejercicio 21 --------
fun showMessage(name: String) {
    println("Hola, $name")
}

fun showMessageExBody(name: String) = println("Hola, $name")

// -------- Ejercicio 22 --------

fun incrementCounter(counter: Int): Int {  /* No se puede porque tiene dos expresiones */
    println("Incrementando...")
    return counter + 1
}

//  --------Expresiones 23 --------
fun getMaximum(a: Int, b: Int): Int {
    val result = if (a > b) a else b
    return result
}

fun getMaximumExBody(a: Int, b: Int): Int =  if (a > b) a else b


//  --------Expresiones 24 --------

fun processNumber(number: Int): Int { /* NO se puede, varias expresiones */
    println("Procesando número...")
    val result = number * 2
    println("Resultado: $result")
    return result
}






















