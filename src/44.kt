import kotlin.math.*

fun main() {
    print("Entre com o logaritmando: ")
    val num = readln().toDouble()

    print("Entre com a base: ")
    val base = readln().toDouble()

    val logaritmo = ln(num) / ln(base)
    println("O logaritmo de $num na base $base é: $logaritmo")
}
