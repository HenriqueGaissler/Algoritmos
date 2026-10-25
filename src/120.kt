fun main() {
    val n = listOf(readln().toDouble(), readln().toDouble(), readln().toDouble()).sorted()
    println("Maior: ${n[2]}")
    println("Intermediário: ${n[1]}")
    println("Menor: ${n[0]}")
}