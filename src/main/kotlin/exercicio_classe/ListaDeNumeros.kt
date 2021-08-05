package exercicio_classe

class ListaDeNumeros(var lista: ArrayList<Int>) {

    fun produto() {
        var result: Int = 1
        for (i in lista) {
            result *= i
        }
        return println(result)
    }
}