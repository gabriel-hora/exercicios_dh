package exercicio_cliente_conta

fun main(){
    val pessoa1 : Cliente = Cliente("Gabriel", "Hora")

    pessoa1.teste.deposito(1000.00)
    pessoa1.teste.saque(1001.00)
}