package ExercicioAbs

class IngressoVip(valor : Double = 350.0) : Ingresso(valor) {

    override fun imprimeValor(){
        println("R$ $valor INGRESSO VIP")
    }
}