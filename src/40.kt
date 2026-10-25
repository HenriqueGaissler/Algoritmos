fun main() {
    print("Entre com o dividendo: ")
    val val1 = readln().toInt()

    print("Entre com o divisor: ")
    val val2 = readln().toInt()

    println("Dividendo: $val1")
    println("Divisor: $val2")
    println("Quociente: ${val1 / val2}")
    println("Resto: ${val1 % val2}")
}
