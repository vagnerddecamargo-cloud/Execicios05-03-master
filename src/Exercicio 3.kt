fun main() {
    val precos = listOf(10.50, 26.79, 7.59, 17.30)
    var total = 0.0

    for (preco in precos) {
        total += preco
    }

    println("Lista de preços: $precos")
    println("Total da compra: R$ %.2f".format(total))
}