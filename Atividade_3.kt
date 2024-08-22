class Aluno(var nome: String, var notas: ArrayList<Double>) {
    // Calcula a média das notas do aluno
    fun calcularMedia(): Double {
        return notas.average()
    }

    // Determina se o aluno foi aprovado
    fun isAprovado(): Boolean {
        return calcularMedia() >= 7.0
    }
}

class Atividade_3 {
    fun notasAlunos() {
        // Lista para armazenar os alunos
        val alunos = arrayListOf<Aluno>()

        // Coleta de dados para 5 alunos
        for (i in 1..5) {
            println("Digite o nome do aluno $i: ")
            val nome = readln()

            // Coleta de 3 notas para cada aluno
            val notas = arrayListOf<Double>()
            for (j in 1..3) {
                print("Digite a nota $j do aluno $i: ")
                val nota = readln().toDouble()
                notas.add(nota)
            }

            // Cria um novo objeto Aluno e adiciona à lista
            val aluno = Aluno(nome, notas)
            alunos.add(aluno)
        }

        // Imprime os resultados
        for (aluno in alunos) {
            val media = aluno.calcularMedia()
            println("Nome do aluno: ${aluno.nome}, Média: $media")
            if (aluno.isAprovado()) {
                println("Resultado: Aprovado")
            } else {
                println("Resultado: Reprovado")
            }
        }
    }
}