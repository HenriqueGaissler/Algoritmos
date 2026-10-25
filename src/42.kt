import kotlin.math.*

fun main() {
    print("Digite um ângulo em graus: ")
    val angulo = readln().toDouble()
    val rad = Math.toRadians(angulo)

    println("Seno: ${sin(rad)}")
    println("Co-seno: ${cos(rad)}")
    println("Tangente: ${tan(rad)}")
    println("Co-secante: ${1 / sin(rad)}")
    println("Secante: ${1 / cos(rad)}")
    println("Co-tangente: ${1 / tan(rad)}")
}
