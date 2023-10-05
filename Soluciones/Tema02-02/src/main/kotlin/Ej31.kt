fun esPrimo(numero: Int): Boolean {
    var esPrimo = true

    when (numero) {
        0, 1 -> esPrimo = false
        2 -> esPrimo = true
        else -> {
            for (i in 2..numero / 2) {
                if (numero % i == 0) {
                    esPrimo = false
                    break
                }
            }
        }
    }
    return esPrimo
}

fun esPrimoConWhile(numero: Int): Boolean {
    var esPrimo = true
    var i = 2
    while (i < numero && esPrimo) {
        if (numero % i == 0) {
            esPrimo = false
        }
        i++
    }
    return esPrimo
}

fun listaPrimos(numero: Int) {
    for (i in 2..numero) {
        if (esPrimo(i)) {
            println(i)
        }
    }
}

fun primosGemelos(numero: Int) {
    for (i in 2..numero) {
        if (esPrimo(i) && esPrimo(i + 2)) {
            println("$i y ${i + 2} son primos gemelos")
        }
    }
}

fun main() {
    println("Es primo 10 ${esPrimoConWhile(10)}")
    println("Es primo 11 ${esPrimoConWhile(11)}")
    println("Es primo 10 ${esPrimo(12)}")
    println("Es primo 11 ${esPrimo(11)}")

    // println("Lista de primos hasta 100")
    //listaPrimos(1000)
    println("Lista de primos gemelos hasta 1000")
    primosGemelos(1000)


}