fun main(){
    print(analiseDeNumeros(5,0,3,4))
}

fun analiseDeNumeros(numA : Int, numB : Int, numC : Int, numD : Int) : Boolean{
    return numA > numB && numA > numC || numB > numC && numB > numD
}