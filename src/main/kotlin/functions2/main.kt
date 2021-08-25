package functions2

fun main() {

    val celular: Produto = Produto("IphoneXS", 3499.0)
    val notebook: Produto = Produto("Dell Inspire", 2499.0)
    val tablet: Produto = Produto("Samsung A7", 2899.0)
    val carrinho: CarrinhoDeCompra = CarrinhoDeCompra()
    val caixa: Caixa = Caixa()

    carrinho.adicionarProdutoNaLista(celular)
    carrinho.adicionarProdutoNaLista(notebook)
    carrinho.adicionarProdutoNaLista(tablet)

    caixa.fechamentoDeConta(cabecalhoDoComprovante, dataDaCompra,
        { imprimeListaDeCompra(carrinho.listaDeProdutos) },{ adicionaRodape(carrinho.listaDeProdutos)})

}

