fun main(){
    // Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares
    cemNumerosImpares(100,-10)
}


fun cemNumerosImpares(tamanho : Int, numeroInicial : Int) {
    val numeros = Array(tamanho) { num1 -> num1 + numeroInicial}
    for(numero in numeros){
        if(numero % 2 !== 0){
            println(numero)
        }
    }
}
