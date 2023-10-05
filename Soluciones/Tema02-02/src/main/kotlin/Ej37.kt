const val MAX_INTENTOS = 5
const val NUM_MIN = 1
const val NUM_MAX = 10

fun main() {
    println("El número secreto")
    do {
        val numeroSecreto = numeroSecreto(NUM_MIN, NUM_MAX)
        var intentos = 0
        var acertado = false
        // for (i in 1..5) {
        // while (!(intentos >= 5 || acertado)) {
        while (intentos < MAX_INTENTOS && !acertado) {
            intentos++
            println("Introduce un número secreto: ")
            val miNumero = readInt()
            /* if (miNumero == numeroSecreto) {
                 println("Has acertado")
                 break
             } else {
                 if (miNumero > numeroSecreto) {
                     println("El número secreto es menor")
                 } else {
                     println("El número secreto es mayor")
                 }
             }*/
            when {
                miNumero == numeroSecreto -> {
                    println("Has acertado")
                    // break
                    acertado = true
                }

                miNumero > numeroSecreto -> println("El número secreto es menor")
                else -> println("El número secreto es mayor")
            }
        }
    } while (salir() != "N")
    println("Adios")
}

fun salir(): String {
    println("¿Desea jugar? (S/N)")
    return readln()
}

fun numeroSecreto(min: Int, max: Int): Int {
    return (min..max).random()
}


fun readInt(): Int {
    var numero = readln().toIntOrNull()
    while (numero == null) {
        println("Introduce un número válido")
        numero = readln().toIntOrNull()
    }
    return numero
}