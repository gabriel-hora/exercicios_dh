fun main(){
    numerosPositivos(100, 0)
}

fun numerosPositivos(tamanho : Int, numeroInicial: Int){
    val numeros = Array(tamanho) {i -> i + numeroInicial}
    for(numero in numeros){
        if(numero >= 0){
            println(numero)
        }
    }
}