class `Exercico 2` {
}fun main() {
    val numeros = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val impares = mutableListOf< Int>()

    for (numero in numeros) {
        if (numero % 2 != 0) {
            impares .add(numero)
        }
    }
    println("Lista original: $numeros")
    println("numeros impares: $impares: $impares")
}