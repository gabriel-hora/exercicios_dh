package `Collection - Exercicios`

fun somaTotal(lista: Set<Int>) {
    var contador: Int = 0
    for (item in lista) {
        contador += item
    }
    println("valor da total: $contador")
}

fun main() {
    val lista = setOf<Int>(1, 5, 5, 6, 7, 8, 8)

    somaTotal(lista)
}