fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun restar(a: Int, b: Int): Int {
    return a - b
}

fun dividir(a: Int, b: Int): Int {
    // While para dividir a entre b
    var cociente = 0
    var resto = a
    while (resto >= b) {
        resto -= b // resto = resto - b
        cociente++ // cociente = cociente + 1
    }
    return cociente
}

fun modulo(a: Int, b: Int): Int {
    // While para dividir a entre b
    /*var cociente = 0
    var resto = a
    while (resto >= b) {
        resto -= b // resto = resto - b
        cociente++ // cociente = cociente + 1
    }
    return resto*/
    // val division = dividir(a, b)
    // return restar(a, multiplicar(division, b))
    return restar(a, multiplicar(dividir(a, b), b))
}

fun multiplicar(a: Int, b: Int): Int {
    // for
    var resultado = 0
    for (i in 1..b) {
        resultado += a
    }
    return resultado
}

fun potencia(a: Int, b: Int): Int {
    // for
    var resultado = 1
    for (i in 1..b) {
        // resultado *= a
        resultado = multiplicar(resultado, a)
    }
    return resultado
}

fun main() {
    println("Suma: ${sumar(2, 3)}")
    println("Resta: ${restar(2, 3)}")
    println("División: ${dividir(10, 3)}")
    println("Módulo: ${modulo(10, 3)}")
    println("Multiplicación: ${multiplicar(2, 3)}")
    println("Potencia: ${potencia(2, 3)}")
}
