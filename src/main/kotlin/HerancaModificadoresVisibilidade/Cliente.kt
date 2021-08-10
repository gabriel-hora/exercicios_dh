package HerancaModificadoresVisibilidade

open class Cliente(
    val id : Int,
    val sobrenome : String,
    val rg : Int,
    var cpf : Long = 0){

    var conta : Contas = Contas(saldo= 0.0)
}