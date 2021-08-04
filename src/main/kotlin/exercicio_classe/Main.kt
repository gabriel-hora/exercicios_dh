package exercicio_classe

import kotlin.collections.ArrayList

fun main(){
    var numerosDoUsuario : ArrayList<Int> = ArrayList()
    numerosDoUsuario.add(2)
    numerosDoUsuario.add(2)
    numerosDoUsuario.add(12)
    numerosDoUsuario.add(45)

    var numeros : ListaDeNumeros = ListaDeNumeros(numerosDoUsuario)
    println(numeros.produto())
}


