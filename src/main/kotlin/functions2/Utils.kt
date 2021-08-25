package functions2

import java.util.*
import java.util.Calendar.*

val cabecalhoDoComprovante: () -> String = { "##########DH SuperMarket##########" }

val dataDaCompra: () -> String = {
    val data = Calendar.getInstance()
    "${data.get(DATE)}/${data.get(MONTH)}/${data.get(YEAR)}"
}

fun imprimeListaDeCompra(listaDeItens: ArrayList<Produto>){
    for(i in listaDeItens){
       println("${i.nome}: R$ ${i.preco}")
    }
}

fun adicionaRodape(listaDeItens: ArrayList<Produto>) : Double{
    var resultado : Double = 0.0
    for(i in listaDeItens){
        resultado += i.preco
    }
    return resultado
}