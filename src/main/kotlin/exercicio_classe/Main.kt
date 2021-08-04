package exercicio_classe

import kotlin.collections.ArrayList

fun main(){
    var numerosDoUsuario : ArrayList<Int> = ArrayList()
    numerosDoUsuario.add(2)
    numerosDoUsuario.add(2)
    numerosDoUsuario.add(2)

    var numeros : ListaDeNumeros = ListaDeNumeros(numerosDoUsuario)
    println(numeros.produto())
}


