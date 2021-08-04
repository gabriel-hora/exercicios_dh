package exercicio_classe

class ListaDeNumeros(var lista: ArrayList<Int>){

    fun produto() : Int{
        var result : Int = 0

        for(i in lista){
            result += i
        }
        return result
    }
}