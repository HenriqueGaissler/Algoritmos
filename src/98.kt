fun main() {
    val salario = readln().toDouble()
    val prestacao = readln().toDouble()
    println(if (prestacao <= salario * 0.3) "Empréstimo concedido" else "Empréstimo negado")
}