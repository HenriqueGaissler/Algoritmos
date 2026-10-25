fun main() {
    val c = readln().toInt() / 100
    println(if (c % 2 == 0) "Par: $c" else "Ímpar: $c")
}