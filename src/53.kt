import kotlin.math.sqrt

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    println("Diagonal: ${sqrt(a * a + b * b + c * c)}")
}
