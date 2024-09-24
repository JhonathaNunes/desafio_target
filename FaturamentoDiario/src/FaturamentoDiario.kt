fun menorFaturamento(vetor: List<Double>) = vetor.min()

fun maiorFaturamento(vetor: List<Double>) = vetor.max()

fun diasAcimaMedia(vetor: List<Double>): Int {
    fun calculaMedia(vetor: List<Double>): Double {
        val diasComValores = vetor.filter { it > 0 }

        return diasComValores.sum() / diasComValores.size
    }

    val media = calculaMedia(vetor)

    return vetor.count { it > media}
}

fun main() {
    println("Digite os valores double separados por vírgula para criar o valor")
    val vetorString = readlnOrNull() ?: ""

    val vetor = vetorString.split(",").map { it.toDouble() }

    println("Menor faturamento: ${menorFaturamento(vetor)}")

    println("Maior faturamento: ${maiorFaturamento(vetor)}")

    println("Dias acima da média: ${diasAcimaMedia(vetor)}")
}