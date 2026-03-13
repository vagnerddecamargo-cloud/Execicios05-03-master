fun main() {
    val idades = listOf(13, 18, 26, 17, 38, 15, 48)
    var soma = 0
    var quantidade = 0

    for (idade in idades) {
        if (idade >= 18) {
            soma += idade
            quantidade++
        }
    }

    if (quantidade > 0) {
        val media = soma.toDouble() / quantidade
        println("Média dos maiores de idade: %.2f".format(media))
    } else {
        println("Não há maiores de idade na lista.")
    }
}