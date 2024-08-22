package Atividades

class Atividade_7
{
    class Voo(val numeroDoVoo: String, val capacidade: Int) {
        private val assentosDisponiveis = IntArray(capacidade) { it + 1 } // Inicializa com todos os assentos disponíveis

        fun reservarAssento(assento: Int): Boolean {
            if (assento in 1..capacidade && assentosDisponiveis.contains(assento)) {
                assentosDisponiveis[assento - 1] = 0 // Marca o assento como reservado
                return true
            }
            return false
        }

        fun exibirAssentosDisponiveis() {
            println("Assentos disponíveis no voo $numeroDoVoo:")
            for (assento in assentosDisponiveis) {
                if (assento != 0) {
                    print("$assento ")
                }
            }
            println()
        }
    }

    fun reserva() {
        val voo = Voo("AA123", 100) // Cria um voo com 100 assentos

        while (true) {
            println("\nMenu:")
            println("1. Verificar disponibilidade de assento")
            println("2. Reservar assento")
            println("3. Sair")
            print("Escolha uma opção: ")

            when (readln().toIntOrNull()) {
                1 -> {
                    voo.exibirAssentosDisponiveis()
                }
                2 -> {
                    print("Digite o número do assento que deseja reservar: ")
                    val assento = readln().toIntOrNull()
                    if (assento != null) {
                        if (voo.reservarAssento(assento)) {
                            println("Assento $assento reservado com sucesso!")
                        } else {
                            println("Assento $assento não está disponível ou é inválido.")
                        }
                    } else {
                        println("Número de assento inválido.")
                    }
                }
                3 -> {
                    println("Saindo...")
                    break
                }
                else -> {
                    println("Opção inválida.")
                }
            }
        }
    }
}