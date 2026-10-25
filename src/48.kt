fun main() {
    print("Entre com o salário mínimo: ")
    val sm = readln().toDouble()

    print("Entre com a quantidade de quilowatts: ")
    val qtdade = readln().toDouble()

    val preco = sm / 700
    val vp = preco * qtdade
    val vd = vp * 0.9

    println("Preço do quilowatt: R$ $preco")
    println("Valor a ser pago: R$ $vp")
    println("Valor com desconto de 10%: R$ $vd")
}
