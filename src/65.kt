fun main() {
    val altura = readln().toDouble()
    val raio = readln().toDouble()

    val volume = Math.PI * raio * raio * altura

    println("Volume da lata: $volume")
}