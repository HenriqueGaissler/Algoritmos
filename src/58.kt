import kotlin.math.ln

fun main() {
    val xnum1 = readln().toDouble()
    val xnum2 = readln().toDouble()
    val xnum3 = readln().toDouble()

    val x = xnum1 + xnum2 / (xnum3 + xnum1) +
            2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)

    println("X = $x")
}
