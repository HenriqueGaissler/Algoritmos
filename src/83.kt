fun main() {
    val n = readln().toDouble()
    println(if (n > 0) 1 / n else kotlin.math.abs(n))
}