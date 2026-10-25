import kotlin.math.pow

fun main() {
    print("Valor da aplicação mensal: ")
    val p = readln().toDouble()

    print("Taxa de juros (ex.: 0.05 para 5%): ")
    val i = readln().toDouble()

    print("Número de meses: ")
    val n = readln().toInt()

    val valor = p * (((1 + i).pow(n.toDouble()) - 1) / i)

    println("Valor acumulado: $valor")
}