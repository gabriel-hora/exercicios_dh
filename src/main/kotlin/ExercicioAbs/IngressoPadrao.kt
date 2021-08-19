package ExercicioAbs

class IngressoPadrao(valor: Double = 100.0) : Ingresso(valor) {

    override fun imprimeValor() {
        println("R$ $valor INGRESSO PADRAO")
    }
}