import kotlin.math.sqrt

fun main() {
    val n = readln().toDouble()
    if (n > 0) println(sqrt(n))
    else if (n < 0) println(n * n)
}