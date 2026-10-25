fun main() {
    println(when (readln().uppercase()) {
        "RJ" -> "Carioca"
        "SP" -> "Paulista"
        "MG" -> "Mineiro"
        else -> "Outros estados"
    })
}