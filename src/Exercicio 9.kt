open class Funcionario(val nome: String, val salario: Double) {
    open fun retornarSalario(): Double {
        return salario
    }
}

class Gerente(nome: String, salario: Double) : Funcionario(nome, salario) {
    override fun retornarSalario(): Double {
        return salario * 1.20
    }
}

fun main() {
    val funcionario = Funcionario("Carlos", 2000.0)
    val gerente = Gerente("Ana", 2000.0)

    println("Salário do funcionário ${funcionario.nome}: R$ %.2f".format(funcionario.retornarSalario()))
    println("Salário do gerente ${gerente.nome}: R$ %.2f".format(gerente.retornarSalario()))
}