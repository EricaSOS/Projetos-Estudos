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
        else -> null
    }
}

fun validarIdade(): Int? {
    print("Insira sua idade: ")
    var idadeDigitada = readLine().toString().trim().toIntOrNull()

    return if (idadeDigitada != null && idadeDigitada >= 0) {
        idadeDigitada
    } else {
        null
    }
}

fun calcularTempoAposentadoria(sexoUsuario: String, idadeUsuario: Int): String{
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

fun imprimirResultadoAposentaria(): String{
    val sexoUsuario = validarSexo() ?: return "Informações inválidas (sexo)."
    val idadeUsuario = validarIdade() ?: return "Informações inválidas (idade)."
    val resultadoAnalise = calcularTempoAposentadoria(sexoUsuario, idadeUsuario)

    return """
        ${"=-".repeat(15)}
        DADOS INFORMADOS
        Sexo: $sexoUsuario
        Idade: $idadeUsuario
        ${"=-".repeat(15)}
        RESULTADO
        $resultadoAnalise
    """.trimIndent()

}


fun main () {
     println(imprimirResultadoAposentaria())
}
