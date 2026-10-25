fun main() {
    print("Digite um número entre 0 e 60: ")
    val num = readln().toInt()

    println("Sucessor: ${(num + 1) % 61}")
}