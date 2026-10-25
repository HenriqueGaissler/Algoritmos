fun main() {
    print("Digite a data no formato DDMMAA: ")
    val data = readln().toInt()

    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100

    val ndata = mes * 10000 + dia * 100 + ano

    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
    println("DATA NO FORMATO MMDDAA: ${ndata.toString().padStart(6, '0')}")
}
