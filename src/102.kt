fun main() {
    val n = readln().toDouble()
    println(when {
        n > 20 -> "Maior que 20"
        n < 20 -> "Menor que 20"
        else -> "Igual a 20"
    })
}