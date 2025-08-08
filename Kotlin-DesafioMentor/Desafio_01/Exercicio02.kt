/*
Exercicio 2 - Calculo de Aposentadoria
Crie um programa que receba a idade e o sexo da pessoa e retorne quanto tempo falta para a
aposentadoria.
Regras:
- Homens se aposentam com 65 anos.
- Mulheres se aposentam com 62 anos.
- O input de sexo pode aceitar: M, Masc, Masculino ou F, Fem, Feminino (nao sensivel a
maiusculas/minusculas).
- Nao permitir letras ou caracteres invalidos na idade.
Exemplos de retorno:
"Faltam 12 anos para voce se aposentar."
"Voce ja esta apto a se aposentar."
"Voce ja esta elegivel a aposentadoria faz 3 anos."
*/

fun validarSexo(): String?{
    print("Insira seu sexo: ")
    var sexoDigitado = readLine().toString().trim().lowercase()

    return when (sexoDigitado) {
        "f", "fem", "feminino" -> "feminino"
        "m", "masc", "masculino" -> "masculino"
        else -> {
            println("Informação inválida.")
            null
        }
    }
}

fun validarIdade(): Int? {
    println("Insira sua idade: ")
    var idadeDigitada = readLine().toString().trim().toIntOrNull()

    return if (idadeDigitada != null && idadeDigitada >= 0) {
        idadeDigitada
    } else {
        println("Informação inválida.")
        null
    }
}

fun calcularTempoMulher(idadeUsuario: Int): String {
    val limiteIdadeMulher = 62
    return when (true) {
        (idadeUsuario == limiteIdadeMulher) -> "Voce ja esta apto a se aposentar."
        (idadeUsuario > limiteIdadeMulher) -> "Voce ja esta elegivel a aposentadoria faz ${idadeUsuario - limiteIdadeMulher} anos."
        else -> "Faltam ${limiteIdadeMulher - idadeUsuario} anos para voce se aposentar."
    }
}

fun calcularTempoHomem(idadeUsuario: Int): String {
    val limiteIdadeHomem = 65
    return when (true) {
        (idadeUsuario == limiteIdadeHomem) -> "Voce ja esta apto a se aposentar."
        (idadeUsuario > limiteIdadeHomem) -> "Voce ja esta elegivel a aposentadoria faz ${idadeUsuario - limiteIdadeHomem} anos."
        else -> "Faltam ${limiteIdadeHomem - idadeUsuario} anos para voce se aposentar."
    }
}

fun calcularTempoAposentaria(): String{
    val idadeUsuario = validarIdade()
    val sexoUsuario = validarSexo()

    if (idadeUsuario == null || sexoUsuario == null) {
        return "Informações inválidas."
    }

    println("=-".repeat(15))
    println("DADOS INFORMADOS")
    println("Sexo: $sexoUsuario")
    println("Idade: $idadeUsuario")
    println("=-".repeat(15))

    return when (sexoUsuario) {
        "feminino" -> calcularTempoMulher(idadeUsuario)
        "masculino" -> calcularTempoHomem(idadeUsuario)
        else -> "Informações inválidas."
    }
}

fun main () {
    println(calcularTempoAposentaria())
}
