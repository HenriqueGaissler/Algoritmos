fun main() {
    val n = readln().toInt()
    println(when {
        n % 10 == 0 -> "Múltiplo de 10"
        n % 2 == 0 -> "Múltiplo de 2"
        n % 5 == 0 -> "Múltiplo de 5"
        else -> "Não é múltiplo de 2 nem de 5"
    })
}