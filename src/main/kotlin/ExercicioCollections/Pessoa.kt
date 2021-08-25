package ExercicioCollections

class Pessoa(var nome : String, var rg : Int){

    override fun equals(other: Any?): Boolean {
        return (other is Pessoa && other.rg == this.rg)
    }

    override fun toString() : String {
        return "${nome} possui o RG ${rg}"
    }

    override fun hashCode(): Int {
        return this.rg
    }
}