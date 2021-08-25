package functions2

class Caixa {

    fun fechamentoDeConta(a: () -> String, b: () -> String, c: () -> Unit, d: () -> Double) {
        println(a.invoke())
        println("Data da Compra: ${b.invoke()}")
        c.invoke()
        println("Valor total: ${d.invoke()}")
    }
}

