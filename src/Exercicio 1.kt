//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    (1..100).map { i ->
        when {
            i % 15 == 0 -> "Batataquente"
            i % 3 == 0 -> "Batata"
            i % 5 == 0 -> "Quente"
            else -> i.toString()
        }

    }.forEach { resultado -> println(resultado)
    }

}