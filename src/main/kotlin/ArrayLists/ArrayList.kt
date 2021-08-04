package ArrayLists

fun CalcularMedia(num1: Double, num2: Double, num3: Double, num4: Double, num5: Double){

    var resultado: Double = (num1 + num2 + num3 + num4 + num5) / 5
    println(resultado)

}

fun main(){
    val listaDeNumeros : ArrayList<Double> = ArrayList()

    listaDeNumeros.add(10.0)
    listaDeNumeros.add(12.0)
    listaDeNumeros.add(14.0)
    listaDeNumeros.add(15.0)
    listaDeNumeros.add(16.0)

    var total : Double = 0.0

    for(i in listaDeNumeros){
        total += i
    }
  print(total / 5)
}