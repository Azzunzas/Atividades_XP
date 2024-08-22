package Atividades

class Atividade_6
{
    fun media() {
        val temperaturas = DoubleArray(30) // Array para armazenar as temperaturas

        // Leitura das temperaturas
        println("Digite as temperaturas diárias do mês:")
        for (i in 0 until 30) {
            print("Dia ${i + 1}: ")
            temperaturas[i] = readln().toDouble()
        }

        // Cálculo da média
        val media = temperaturas.average()

        // Encontrar a temperatura máxima e o dia em que ocorreu
        var maxima = temperaturas[0]
        var diaMaxima = 1
        for (i in 1 until 30) {
            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i]
                diaMaxima = i + 1
            }
        }

        // Encontrar a temperatura mínima e o dia em que ocorreu
        var minima = temperaturas[0]
        var diaMinima = 1
        for (i in 1 until 30) {
            if (temperaturas[i] < minima) {
                minima = temperaturas[i]
                diaMinima = i + 1
            }
        }

        // Exibir os resultados
        println("\nResultados:")
        println("Temperatura média: $media")
        println("Temperatura máxima: $maxima (ocorreu no dia $diaMaxima)")
        println("Temperatura mínima: $minima (ocorreu no dia $diaMinima)")
    }
}