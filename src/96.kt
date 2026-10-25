fun main() {
    val n = readln().toInt()
    println(if (n % 3 == 0 && n % 7 == 0) "Sim" else "Não")
}