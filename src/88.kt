fun main() {
    val op = readln()
    val a = readln().toDouble()
    val b = readln().toDouble()
    println(when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0.0) a / b else "Divisão impossível"
        else -> "Opção inválida"
    })
}