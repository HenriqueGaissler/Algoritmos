fun main() {
    println("1 - Mercúrio")
    println("2 - Vênus")
    println("3 - Marte")
    println("4 - Júpiter")
    println("5 - Saturno")
    println("6 - Urano")
    print("Escolha o planeta: ")
    val op = readln().toInt()

    print("Digite seu peso na Terra: ")
    val peso = readln().toDouble()

    val gravidade = when (op) {
        1 -> 0.37
        2 -> 0.88
        3 -> 0.38
        4 -> 2.64
        5 -> 1.15
        6 -> 1.17
        else -> 0.0
    }

    if (gravidade != 0.0) {
        println("Peso no planeta: ${peso / 10 * gravidade}")
    } else {
        println("Planeta inválido.")
    }
}