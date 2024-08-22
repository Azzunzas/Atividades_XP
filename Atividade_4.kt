package Atividades

class Atividade_4
{
    val nomesPessoas = ArrayList<String>()

    fun ordem(){
        for( i in 1..10 )
        {
            println("Digite o nome da pessoa $i")
            var nome = readln()
            nomesPessoas.add(nome)
        }
        println("fora de ordem $nomesPessoas")

        nomesPessoas.sort()

        println("em ordem alfabetica ${nomesPessoas.joinToString(", ")}" )
    }

}