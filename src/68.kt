fun main() {
    var a = readln().toDouble()
    var b = readln().toDouble()

    val aux = a
    a = b
    b = aux

    println("a = $a")
    println("b = $b")
}