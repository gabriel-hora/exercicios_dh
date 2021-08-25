package Lambdas

fun main(){

    val lista: (List<Int>) -> Int = {
        var resultado : Int = 1
        for(item in it){
            resultado *= item
        }
        resultado
    }

    println("O produto da sua lista é: ${lista(listOf(1,2,3,4,5,7))}")
}