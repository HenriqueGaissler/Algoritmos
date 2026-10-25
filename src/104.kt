fun main() {
    val nome = readln()
    val sexo = readln()
    val idade = readln().toInt()
    println("$nome ${if (sexo.equals("f", true) && idade < 25) "ACEITA" else "NÃO ACEITA"}")
}