fun main() {
    print("Entre com o 1º número: ")
    val a = readln().toDouble()

    print("Entre com o 2º número: ")
    val b = readln().toDouble()

    print("Entre com o 3º número: ")
    val c = readln().toDouble()

    print("Entre com o 4º número: ")
    val d = readln().toDouble()

    val mp = (a + b * 2 + c * 3 + d * 4) / 10
    println("Média ponderada: $mp")
}
