package InterfaceKotlin

class Impressora() {

    val listaImprimivel = mutableListOf<Imprimivel>()

    fun colocarNaLista(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun imprimir() {
        for (i in listaImprimivel) {
            (i.imprimir())
        }
    }
}