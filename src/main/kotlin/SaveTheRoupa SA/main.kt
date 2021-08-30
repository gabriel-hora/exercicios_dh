package `SaveTheRoupa SA`

fun main(){

    var peca1 = Peca("Nike", "AirForce")
    var peca2 = Peca("Adidas", "Originals")
    var peca3 = Peca("Havaianas", "Branca e Azul")

    var peca4 = Peca("Apple","Iphone XS")
    var peca5 = Peca("Samsung","S7")


    var listaDePecas0 = mutableListOf(peca1, peca2, peca3)
    var listaDePecas1 = mutableListOf(peca4,peca5)
    var repositorio = GuardaVolumes()

    repositorio.guardarPecas(listaDePecas0)
    repositorio.guardarPecas(listaDePecas1)

    repositorio.mostrarPecas()

    repositorio.devolverPecas(1)

    repositorio.mostrarPecas()
}

