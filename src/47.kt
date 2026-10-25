fun main() {
    print("Entre com um número de 3 dígitos: ")
    val num = readln().toInt()

    val c = num / 100
    val d = num % 100 / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c

    println("Número: $num")
    println("Invertido: $num1")
}
