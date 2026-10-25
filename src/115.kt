import kotlin.math.sqrt

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    if (a == b) println("Números iguais")
    else {
        println("Quadrado do menor: ${minOf(a, b) * minOf(a, b)}")
        val maior = maxOf(a, b)
        if (maior >= 0) println("Raiz do maior: ${sqrt(maior)}")
    }
}