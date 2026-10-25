fun main() {
    print("Digite o número de lados: ")
    val n = readln().toInt()

    val diagonais = n * (n - 3) / 2.0

    println("Número de diagonais: $diagonais")
}