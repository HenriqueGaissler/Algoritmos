fun main() {
    val hora = readln().toInt()
    val minuto = readln().toInt()

    val tminuto = hora * 60 + minuto

    println("Ate agora se passaram: $tminuto minutos")
}