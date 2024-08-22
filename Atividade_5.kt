package Atividades

import kotlin.random.Random

class Atividade_5
{
    fun jogarDados() {
        println("Quantos dados deseja jogar? ")
        val quant = readln().toInt()

        for (i in 1..quant) {
            // Gera um número aleatório entre 1 e 6
            val dado1 = Random.nextInt(1, 7)
            val dado2 = Random.nextInt(1, 7)

            // Soma os valores dos dados
            val soma = dado1 + dado2

            // Imprime os resultados
            println("Dado 1: $dado1, Dado 2: $dado2, Soma: $soma")
        }
    }
}