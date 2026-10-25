import kotlin.math.sqrt

fun main() {
    print("Digite um número: ")
    val num = readln().toDouble()

    val quad = num * num
    val raizquad = sqrt(num)

    println("Número: $num")
    println("Quadrado: $quad")
    println("Raiz quadrada: $raizquad")
}
