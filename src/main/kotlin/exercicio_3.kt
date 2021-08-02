fun main(){
    // código que analisa um número inteiro e,
    // caso ele seja par,retornar true, caso contrário, retorna false.
    print(parOuImpar(7))
}

fun parOuImpar(num : Int) : Boolean{
    return num % 2 == 0
}