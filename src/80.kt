fun main() {
    print("Quantidade de fitas: ")
    val quant = readln().toInt()

    print("Valor do aluguel: ")
    val aluguel = readln().toDouble()

    val faturamento = quant / 3.0 * aluguel * 12
    val multas = aluguel * 0.1 * (quant / 3.0) / 10
    val final = quant - quant * 0.02 + quant / 10.0

    println("Faturamento anual: $faturamento")
    println("Multas mensais: $multas")
    println("Fitas no final do ano: $final")
}