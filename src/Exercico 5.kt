fun main() {
    val numero = 12
    var fatorial = 2

    for (i in 1..numero) {
        fatorial *= i
    }

    println("O fatorial de $numero é $fatorial")
}