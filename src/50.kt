import kotlin.math.sqrt

fun main() {
    val base = readln().toDouble()
    val altura = readln().toDouble()

    println("Perímetro = ${2 * (base + altura)}")
    println("Área = ${base * altura}")
    println("Diagonal = ${sqrt(base * base + altura * altura)}")
}
