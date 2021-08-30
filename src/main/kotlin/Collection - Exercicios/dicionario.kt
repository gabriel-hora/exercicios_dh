package `Collection - Exercicios`

fun main(){

    val dicionario = mapOf<Int, String>(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )


    fun imprimirLista(lista: Map<Int, String>){
        for((chave, valor) in lista){
            println("$chave -> $valor")
        }
    }

    imprimirLista(dicionario)
}