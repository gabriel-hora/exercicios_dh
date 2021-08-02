fun main(){
    //  código que analisa duas cadeias de texto e, caso sejamdiferentes, retornar true,
    //  ou, caso sejam iguais, retornar false
    print(validacaoDeTexto("Professor Romário" , "Professor Jônatas"))
}

fun validacaoDeTexto(texto1 : String, texto2 : String) : Boolean{
    return texto1 === texto2
}