package RevisaoExercicio3

class Estoque(val nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    init {
        if (qtdAtual < 0 && qtdMinima < 0) {
            println("Não pode ser negativo")
        }
    }

    fun mudarNome(nome: String): Unit {
    }

    fun mudarQtdMinima(qtdMinima: Int): Unit {
    }

    fun repor(qtd: Int): Unit {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int): Unit {
        qtdAtual -= qtd
    }

    fun mostra(): Unit {
        println("$nome , $qtdMinima , $qtdAtual")
    }


    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }
}
