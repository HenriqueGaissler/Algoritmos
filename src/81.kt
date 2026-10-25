fun main() {
    print("Digite uma conta de três dígitos: ")
    val conta = readln().toInt()

    val d1 = conta / 100
    val d2 = conta / 10 % 10
    val d3 = conta % 10

    val inverso = d3 * 100 + d2 * 10 + d1
    val soma = conta + inverso

    val a = soma / 100
    val b = soma / 10 % 10
    val c = soma % 10

    val digito = (a + b * 2 + c * 3) % 10

    println("Dígito verificador: $digito")
}