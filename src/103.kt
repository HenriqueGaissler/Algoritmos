fun main() {
    val atual = readln().toInt()
    val nascimento = readln().toInt()
    println(if (nascimento > atual) "Ano inválido" else atual - nascimento)
}