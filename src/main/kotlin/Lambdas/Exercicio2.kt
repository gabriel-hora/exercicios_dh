package Lambdas

fun main(){

    val validar: (String) -> Boolean = { email ->
        email.contains("@")
    }

    println(validacao("Gabriel.contato@2013outlook.com",validar))
}

fun validacao(email: String, validar: (String) -> Boolean): Boolean {
    return email.contains("@")
}