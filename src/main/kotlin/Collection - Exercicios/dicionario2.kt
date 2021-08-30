package `Collection - Exercicios`

fun main() {

    var joao = mutableListOf<String>("Juan", "El Divo" , "Maromba", "Zé Bonitinho")
    var miguel = mutableListOf<String>("Dark Knight", "Bruce Wayne", "Batflack", "Gengiva")
    var maria = mutableListOf<String>("Ju", "Mary", "Marilene", "Ventania")
    var lucas = mutableListOf<String>("Lukinha", "Jorge", "George", "Kevin Flynn")

    val listaDeApelidos = mapOf<String, List<String>>(
        "joao" to joao,
        "miguel" to miguel,
        "maria" to maria,
        "lucas" to lucas
    )

    fun imprimirMap(lista: Map<String, List<String>>){
        for((chave,valor) in lista){
            print(chave)
            for(item in lista){
                println(valor.joinToString(prefix = " -> " ,separator = ","))
                break
            }
        }
    }

    imprimirMap(listaDeApelidos)
}