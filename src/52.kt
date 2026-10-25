import kotlin.math.sqrt

fun main() {
    val lado = readln().toDouble()
    println("Perímetro: ${4 * lado}")
    println("Área: ${lado * lado}")
    println("Diagonal: ${lado * sqrt(2.0)}")
}
