package `SaveTheRoupa SA`

open class GuardaVolumes {

    var dicionario = mutableMapOf<Int, List<Peca>>()
    var contador: Int = 0

    fun guardarPecas(lista: MutableList<Peca>) {
        dicionario[contador] = lista
        println("Pertences guardado com Sucesso!")
        println("Código de Acesso: $contador\n")
        contador++
    }

    fun mostrarPecas() {
        for (i in 0..dicionario.keys.size) {
            var temp = dicionario[i]
            if (temp != null) {
                println("Armário $i --------------------------")
                temp.forEach() { println("Marca:${it.marca} -> Modelo: ${it.modelo}") }
                println("")
            }
        }
    }

    fun mostrarPecas(numero: Int) {
        for (i in dicionario) {
            var temp = dicionario[numero]
            if (temp != null) {
                println("Armário $i --------------------------")
                temp.forEach() { println("Marca:${it.marca} -> Modelo: ${it.modelo}") }
                println("")
            }
        }
    }

    fun devolverPecas(numero: Int) {
        println("o armario $numero foi removido------------\n")

        for ((chave, valor) in dicionario) {
            if (chave == numero) {
                dicionario.remove(chave)
            }
        }
    }
}