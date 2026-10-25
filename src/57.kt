 fun main() {
    val pr1 = readln().toDouble()
    val pr2 = readln().toDouble()
    val mf = (pr1 + pr2) / 2

    println("Média truncada = ${mf.toInt()}")
    println("Média arredondada = ${kotlin.math.round(mf).toInt()}")
}
