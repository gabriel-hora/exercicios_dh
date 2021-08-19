package InterfaceKotlin

fun main() {

    var foto: Foto = Foto("Instagram", "Foto")
    var documento: Documento = Documento("RG", "53153153-1")
    var contrato: Contrato = Contrato("Avaliação", "Relatorio")
    var impressora: Impressora = Impressora()

    impressora.colocarNaLista(foto)
    impressora.colocarNaLista(documento)
    impressora.colocarNaLista(contrato)

    impressora.imprimir()
}