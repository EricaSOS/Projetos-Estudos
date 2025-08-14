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
        null
    }
}

fun calcularTempoAposentadoria(idadeUsuario: Int): String{
    val sexoUsuario = validarSexo()
    var limiteIdade: Int

    if (sexoUsuario == "feminino"){
        limiteIdade = 62
    } else {
        limiteIdade = 65
    }

    return when (true) {
        (idadeUsuario == limiteIdade) -> "Voce ja esta apto a se aposentar."
        (idadeUsuario > limiteIdade) -> "Voce ja esta elegivel a aposentadoria faz ${idadeUsuario - limiteIdade} anos."
        (idadeUsuario < limiteIdade) -> "Faltam ${limiteIdade - idadeUsuario} anos para voce se aposentar."
        else -> "Não foi possível calcular."
    }
}

fun analisarAposentaria(): String{
    val idadeUsuario = validarIdade() ?: return "Informações inválidas."
    val sexoUsuario = validarSexo() ?: return "Informações inválidas."
    val resultadoAnalise = calcularTempoAposentadoria(idadeUsuario) ?: "Não foi possível calcular."

    println("=-".repeat(15))
    println("DADOS INFORMADOS")
    println("Sexo: $sexoUsuario")
    println("Idade: $idadeUsuario")
    println("=-".repeat(15))
    println(resultadoAnalise)
}


fun main () {
     println(analisarAposentaria())
}
