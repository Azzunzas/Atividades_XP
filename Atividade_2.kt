package Atividades

class Atividade_2
{
    fun contarPalavra()
    {
        println("Escreva uma frase para que o programa conte as palavras: ")
        val texto = readln()

        val palavras= texto.split(' ',',','.',':',';','?','!','"').filter { it.isNotEmpty() }

        val quant = palavras.size

        println("A frase $texto contem $quant palavras")

    }
}