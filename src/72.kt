fun main() {
    val deposito = readln().toDouble()
    val taxa = readln().toDouble()

    val valor = deposito * taxa / 100
    val total = deposito + valor

    println("Rendimentos: $valor")
    println("Total: $total")
}