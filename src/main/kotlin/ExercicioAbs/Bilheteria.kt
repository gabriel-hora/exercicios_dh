package ExercicioAbs

import java.util.*

fun main() {

    val ingressoVIP = IngressoVip()
    val ingressoPadrao = IngressoPadrao()

    val scanner = Scanner(System.`in`)
    println("Qual ingresso você quer?")
    println(
        """
        1 - IngressoVIP
        2 - IngressoPadrão
    """.trimIndent()
    )

    var escolhaUsuario = scanner.nextInt()

    if (escolhaUsuario == 1) {
        ("Você escolheu ${ingressoVIP.imprimeValor()}")
    } else {
        ("Você escolheu ${ingressoPadrao.imprimeValor()}")
    }
}
