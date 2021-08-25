package Lambdas

fun main() {

    val soma: (Int, Int) -> Int = { num1: Int, num2: Int -> num1 + num2 }
    val subtracao: (Int, Int) -> Int = { a: Int, b: Int -> a - b }
    val multiplicacao: (Int, Int) -> Int = { a: Int, b: Int -> a * b }
    val divisao: (Int, Int) -> Int = { a: Int, b: Int -> a / b }

    calculo(10,10,subtracao)
    calculo(10,10,soma)
    calculo(10,10,multiplicacao)
    calculo(10,10,divisao)

}

fun calculo(num1: Int, num2: Int, calcular: (Int,Int) -> Int){
    println(calcular(num1,num2))
}


