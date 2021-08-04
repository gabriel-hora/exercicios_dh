package Visibilidade

// privado: Sómente daquela classe
// publico: Todas classes
// protegido:


open class Visibilidade {

    public var a = "publico"
    private var b = "privado"
    protected var c = "Protegido"
    internal var d = "internal"

}

class  minhaClase : Visibilidade(){

    fun teste(){
        print(a)
        //print(b)
        print(c)
        print(d)
    }
}
