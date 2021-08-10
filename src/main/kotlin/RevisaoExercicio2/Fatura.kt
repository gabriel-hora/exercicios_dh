package RevisaoExercicio2

open class Fatura(
    var itemFaturado: Int,
    var descItem: String,
    var qtdItem: Int,
    var precoUnit: Double
) {

    fun totalDaFatura(): Double {
        return qtdItem * precoUnit
    }
}