import kotlin.math.floor

fun main() {
    val num = readln().toDouble()

    val numi = floor(num).toInt()
    val numfrac = num - numi
    val numa = floor(num + 0.5).toInt()

    println("Parte inteira: $numi")
    println("Parte fracionaria: %.3f".format(numfrac))
    println("Numero arredondado: $numa")
}