package HerancaModificadoresVisibilidade

fun main(){
    val cliente1 : Cliente = Cliente(1,"Hora",530190880,12365478920)
    val cliente2 : Cliente = Cliente(2,"Silva",530190881,12365478921)

    cliente1.conta.depositar(100.00)
    cliente1.conta.depositar(500.50)

    cliente1.conta.contaPoupanca.recolherJuros(100.00)
}