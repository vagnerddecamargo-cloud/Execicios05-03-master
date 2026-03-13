class ContaBancaria(val nomeTitular: String, private var saldo: Double) {

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$ %.2f realizado com sucesso.".format(valor))
        } else {
            println("Valor de depósito inválido.")
        }
    }

    fun sacar(valor: Double) {
        if (valor <= 0) {
            println("Valor de saque inválido.")
        } else if (valor > saldo) {
            println("Saldo insuficiente.")
        } else {
            saldo -= valor
            println("Saque de R$ %.2f realizado com sucesso.".format(valor))
        }
    }

    fun consultarSaldo() {
        println("Saldo atual de $nomeTitular: R$ %.2f".format(saldo))
    }
}

fun main() {
    val conta = ContaBancaria("João", 1000.0)

    conta.consultarSaldo()
    conta.depositar(500.0)
    conta.sacar(300.0)
    conta.consultarSaldo()
}