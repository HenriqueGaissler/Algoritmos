fun main() {
    val valor = readln().toDouble()
    val taxa = readln().toDouble()
    val tempo = readln().toInt()

    val prest = valor + (valor * (taxa / 100) * tempo)

    println("Valor da prestacao em atraso: $prest")
}