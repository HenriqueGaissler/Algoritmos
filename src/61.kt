fun main() {
    val termo = readln().toInt()
    val razao = readln().toInt()

    val quinto = termo * razao * razao * razao * razao

    println("O 5o termo desta P.G. e: $quinto")
}