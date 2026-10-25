fun main() {
    val na = readln().toInt()
    val vha = readln().toDouble()
    val pd = readln().toDouble()

    val sb = na * vha
    val td = (pd / 100) * sb
    val sl = sb - td

    println("Salario liquido: $sl")
}