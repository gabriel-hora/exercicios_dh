fun main() {
    //Código que lê três numêros inteiros e retorna o Maior
    print(retornaMaior(70.0,20.0,100.0))
}

fun retornaMaior(num1: Double, num2: Double, num3: Double): Double{
    if(num1 > num2 && num1 > num3) {
        return num1
    }else if(num2 > num3){
        return num2
    }else{
        return num3
    }
}


