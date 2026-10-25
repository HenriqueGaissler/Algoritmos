fun main() {
    val r = readln()
    println(when (r) {
        "Brasília", "BRASÍLIA" -> "PARABÉNS!"
        "brasília", "Brazília", "BRAZÍLIA", "brazília" -> "CERTO! Atenção à grafia."
        else -> "ERRADO! ESTUDE MAIS!"
    })
}