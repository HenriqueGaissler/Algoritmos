fun main() {
    print("Entre com um nome: ")
    val nome = readln()

    println("Todo nome: $nome")
    println("Primeiro caractere: ${nome.first()}")
    println("Último caractere: ${nome.last()}")
    println("Do primeiro ao terceiro: ${nome.take(3)}")
    println("Quarto caractere: ${nome.getOrNull(3) ?: ""}")
    println("Todos menos o primeiro: ${nome.drop(1)}")
    println("Os dois últimos: ${nome.takeLast(2)}")
}
