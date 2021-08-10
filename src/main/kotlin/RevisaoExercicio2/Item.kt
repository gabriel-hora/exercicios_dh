package RevisaoExercicio2

class Item() : Fatura(descItem = "",qtdItem = 0,itemFaturado = 0,precoUnit = 0.0){
    init {
        if(qtdItem < 0){
            qtdItem = 0
        }

        if (precoUnit < 0){
            precoUnit = 0.0
        }
    }
}