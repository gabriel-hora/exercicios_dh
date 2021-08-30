package `Collection - Exercicios`

fun main(){

    val listaVazia = mutableListOf<Int>()

    listaVazia.add(1)
    listaVazia.add(5)
    listaVazia.add(5)
    listaVazia.add(6)
    listaVazia.add(7)
    listaVazia.add(8)
    listaVazia.add(8)
    listaVazia.add(8)

    for (item in listaVazia){
        print("$item ")
    }
}