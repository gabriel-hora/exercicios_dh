package Classes

class Pessoa(val idade : Int, val sexo : String, val contribuicao : Int) {

    fun validacao() {
        if (sexo == "Homem" && idade >= 65 && contribuicao >= 30 ||
            sexo == "Mulher" && idade >= 60 && contribuicao >= 30){
           return print(true)
        }else return print(false)
    }
}
