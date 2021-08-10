package HerancaModificadoresVisibilidade

open class ContaPoupanca() : Contas(0.0){

    private var juros : Double = 0.0

    fun recolherJuros(valor : Double){
        if(valor > juros){
            println("Você não tem dinheiro em juros suficiente")
        }else{
            saldo += juros
        }
    }
}