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


fun calcularTempoAposentaria(): String{
    val idade = validarIdade()
    val sexo = validarSexo()
    val limiteIdadeHomem = 65
    val limiteIdadeMulher = 62
    var saldoIdade:Int
    var mensagem:String

    println("DADOS INFORMADOS")
    println("Sexo: $sexo")
    println("Idade: $idade")
    println("=-".repeat(15))

    when (sexo) {
        "feminino" -> {
            if (idade == limiteIdadeMulher) {
                mensagem = "Voce ja esta apto a se aposentar."
            } else if (idade > limiteIdadeMulher) {
                saldoIdade = idade - limiteIdadeMulher
                mensagem = "Voce ja esta elegivel a aposentadoria faz $saldoIdade anos."
            } else {
                saldoIdade = limiteIdadeMulher - idade
                mensagem = "Faltam $saldoIdade anos para voce se aposentar."
            }
        }

        "masculino" -> {
            if (idade == limiteIdadeHomem) {
                mensagem = "Voce ja esta apto a se aposentar."
            } else if (idade > limiteIdadeHomem) {
                saldoIdade = idade - limiteIdadeHomem
                mensagem = "Voce ja esta elegivel a aposentadoria faz $saldoIdade anos."
            } else {
                saldoIdade = limiteIdadeHomem - idade
                mensagem = "Faltam $saldoIdade anos para voce se aposentar."
            }

        }

        else -> {
            mensagem = "Informações inválidas."
        }


    }
    return mensagem
}

fun main () {
    println(calcularTempoAposentaria())
}
