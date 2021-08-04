package abstrado_e_interface


interface falar{
    fun falar()
}

open class Humano(){
    fun declararHumano(){
        println("Eu sou Humano")
    }
}


class Gabriel : Humano(), falar {
    override fun falar() {
        println("Olá Mundo")
    }
}

class Paul : Humano(), falar{
    override fun falar() {
        println("Hello World")
    }
}

fun main(){
    var gabriel = Gabriel()
    var paul = Paul()

    gabriel.falar()
    paul.falar()
}

