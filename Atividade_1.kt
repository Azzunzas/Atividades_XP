package Atividades

class Atividade_1
{
    fun primeNumbers()
    {
        var div = 0
        println("digite um número para ver se é primo ")
        val num = readln().toInt()

        for(i in 1 ..(num))
        {
            div = num%i
            if(div == 0 && i != num && i != 1)
                println("O numero $num NAO É PRIMO e É divisivel por $i")
            if(div == 0 && i == num)
                println("O numero $num É PRIMO e divisivel por 1 e por $num")
        }

    }

}