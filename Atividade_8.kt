package Atividades

class Atividade_8
{
    class Produto(val nome: String, var quantidade: Int, val nivelMinimo: Int, val nivelMaximo: Int) {
        fun reporEstoque() {
            quantidade = nivelMaximo
            println("Estoque do produto '$nome' reposto para $nivelMaximo unidades.")
        }
    }

    fun prod() {
        val produtos = mutableListOf<Produto>()

        // Cadastro de 5 produtos
        for (i in 1..5) {
            print("Digite o nome do produto $i: ")
            val nome = readln()
            print("Digite a quantidade inicial do produto $i: ")
            val quantidade = readln().toIntOrNull() ?: 0
            print("Digite o nível mínimo do produto $i: ")
            val nivelMinimo = readln().toIntOrNull() ?: 0
            print("Digite o nível máximo do produto $i: ")
            val nivelMaximo = readln().toIntOrNull() ?: 0

            produtos.add(Produto(nome, quantidade, nivelMinimo, nivelMaximo))
        }

        // Verificação de estoque e reposição
        for (produto in produtos) {
            println("\nProduto: ${produto.nome}")
            println("Quantidade disponível: ${produto.quantidade}")

            if (produto.quantidade < produto.nivelMinimo) {
                produto.reporEstoque()
            }
        }
    }
}