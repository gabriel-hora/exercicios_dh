package HerancaModificadoresVisibilidade

open class Contas(var saldo : Double) {

    open var contaPoupanca : ContaPoupanca = ContaPoupanca()

    fun depositar(valor: Double) {
        saldo += valor
        println("Você depositou $valor e ficou com $saldo de saldo")
    }

    fun sacarDinheiro(valor: Double) {
        if (valor > saldo) {
            println("Você não tem dinheiro suficiente")
        } else {
            saldo -= valor
            println("Você sacou $valor e ficou com $saldo de saldo")
        }
    }
}