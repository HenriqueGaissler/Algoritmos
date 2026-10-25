fun main() {
    val n = readln().toDouble()
    println(when {
        n > 0 -> "POSITIVO"
        n < 0 -> "NEGATIVO"
        else -> "NULO"
    })
}