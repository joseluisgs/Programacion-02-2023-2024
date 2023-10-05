fun loteria() {
    for (i in 1..6) {
        println("El número es: ${(1..49).random()}")
    }
}

fun quiniela() {
    for (i in 1..15) {
        val sorteo = (1..3).random()
        if (i < 15) {
            println("El partido $i ha salido $sorteo")
        } else {
            println("El pleno al 15 ha salido $sorteo")
        }
    }
}

fun main() {
    loteria()
    quiniela()
}