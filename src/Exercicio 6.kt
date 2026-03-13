class Pessoa(val nome: String, val idade: Int, val cidade: String) {
    fun apresentar() {
        println("$nome tem $idade anos e mora em $cidade.")
    }
}

fun main() {
    val pessoa = Pessoa("Maria", 25, "São Paulo")
    pessoa.apresentar()
}