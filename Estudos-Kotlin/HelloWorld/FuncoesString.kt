// String é um conjunto de caracteres
// nomes de variaveis devem ser nomeadas conforme as suas responsabilidades

fun main(){
    val str = "Programação Kotlin!"

    //index inicia sempre do 0
    //Acesar a primeira letra
    println(str[0])
    // Comprimento da String
    println(str.length)
    // Saber se inicia com "Progra"
    println(str.startsWith("Progra"))
    println(str.startsWith("progra"))
    //Saber se termina com ponto final
    println(str.endsWith("."))
    //Pegar apenas uma parte da string
    println(str.substring(6))
    println(str.substring(6,8))
    //Substituição de letras na minha string
    println(str.replace("o", "a"))
    // String em letras maiúsculas
    println(str.uppercase())
    // String em letras minúsculas
    println(str.lowercase())
    //Verificar se uma string contém determinado valor
    println(str.contains("Kotlin"))
    println(str.contains("kotlin"))
    //Verificar se uma string é vazia
    str.isEmpty()
    //Retirar espaços em branco no começo e final
    println(str.trim())
}
