fun main() {
    val n = readln().toInt() / 100
    println(if (n % 4 == 0) "É múltiplo de 4" else "Não é múltiplo de 4")
}