package RevisaoExercicio2

fun main() {
    var cliente1: Cliente = Cliente(1, "Gabriel Hora")
    cliente1.cliente.itemFaturado = 1
    cliente1.cliente.descItem = "celular"
    cliente1.cliente.precoUnit = 2000.00
    cliente1.cliente.qtdItem = -3

    println(cliente1.cliente.totalDaFatura())
}