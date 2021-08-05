package exercicio_cliente_conta

public class Conta(var numeroDaConta: Int, var saldo: Double, titular: Cliente?) {

    fun deposito(valor: Double){
        saldo += valor
        println("Saldo atualizado: $saldo")
    }

    fun saque(valor: Double){
        if(saldo < valor){println("você não tem saldo suficiente | Saldo: $saldo")
        }else{
            saldo -= valor
            println("Saldo atualizado: $saldo")
        }
    }
}