package InterfaceKotlin

open class Documento(override val nome: String, override val tipoDeDocumento: String) : Imprimivel {

    override fun imprimir() {
        println("Eu sou $tipoDeDocumento, $nome")
    }
}