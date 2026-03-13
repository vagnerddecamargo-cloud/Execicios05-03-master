data class Produto(val nome: String, val preco: Double)

fun main() {
    val produtos = arrayOf(
        Produto("Mouse", 50.0),
        Produto("Teclado", 120.0),
        Produto("Monitor", 900.0),
        Produto("Headset", 250.0)
    )

    var maisCaro = produtos[0]

    for (produto in produtos) {
        if (produto.preco > maisCaro.preco) {
            maisCaro = produto
        }
    }

    println("Produto mais caro: ${maisCaro.nome}")
}