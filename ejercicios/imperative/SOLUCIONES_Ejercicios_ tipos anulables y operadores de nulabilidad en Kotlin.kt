package ejercicios.imperative.nulabilidad

/* ===================== Nivel 1 — Conceptos básicos ========================= */
/*  ------- Ejercicio 1 — Una variable anulable ------- */
fun ejercicio1() {
    var name: String? = "Carlos"
    println(name)
    name = null
    println(name)

}

/*  ------- Ejercicio 2 — String no anulable frente a String anulable ------- */
fun ejercicio2() {
    var firstName = "Juan"
    var secondName: String? = null
    println(firstName + " " + secondName)


}

/*  ------- Ejercicio 5 — El compilador protege contra null ------- */
fun ejercicio5() {
    val name: String? = "Carlos"

    /*  println(name.length) */
    println(name?.length)
}
/* El compilador es estricto y solo
 se fija en tipo de dato String? Como existe la posibilidad téxnica de
que String sea null, te bloque y no de deja acceder a sus propiedades*/


/* ============ Nivel 2 — Operador ?. ============== */
/* -------- Ejercicio 6 — Acceso seguro ---------- */

fun ejercicio6() {
    var name: String? = "Carlos"
    println(name?.length)
    name = null
    println(name?.length)

}

/* -------- Ejercicio 9 — Encadenamiento de ?. ---------- */
fun ejercicio9() {
    var text: String? = "Kotlin"
    println("Longitud: ${text?.length}, Primera letra: ${text?.get(0)}, Segunda letra: ${text?.get((text?.length ?: 0) - 1)}")
    text = null
    println("Longitud: ${text?.length}, Primera letra: ${text?.get(0)}, Segunda letra: ${text?.get((text?.length ?: 0) - 1)}")
}

/* ============= Nivel 3 — Operador Elvis ?: ============= */
/* -------- Ejercicio 11 — Valor por defecto ---------- */
fun ejercicio11() {

    val name: String? = null

    // Imprime 'name'. Si 'name' es null, imprime "Desconocido" en su lugar.
    println(name ?: "Desconocido")

}

/* -------- Ejercicio 13 — Edad por defecto ---------- */
fun getAge(age: Int?): Int = age ?: 0

/* -------- Ejercicio 14 — Mensaje por defecto ---------- */
fun ejercicio14 () {
    val message: String? = null
    println(message ?: "Sin mensaje")
}


fun main() {
    println(getAge(0))
    ejercicio14()
}
