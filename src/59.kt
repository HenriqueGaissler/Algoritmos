import kotlin.math.sqrt

fun main() {
    val b = readln().toDouble()
    val c = readln().toDouble()

    println("A hipotenusa é: ${sqrt(b * b + c * c)}")
}
