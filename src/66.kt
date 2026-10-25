fun main() {
    val tempo = readln().toDouble()
    val vel = readln().toDouble()

    val dist = tempo * vel
    val litros = dist / 12

    println("Velocidade media: $vel")
    println("Tempo gasto: $tempo")
    println("Distancia percorrida: $dist")
    println("Litros utilizados: $litros")
}