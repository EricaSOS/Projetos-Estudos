package Exercicios/*
* Escreva uma função que seja capaz de receber uma string e retornar a quantidade de
* caracteres.
* */

fun exercicio5 (palavras : String) {
    val contCaracteres = palavras.replace(" ", "").length
    println("'$palavras' possui $contCaracteres caracteres")
}

fun main (){
    exercicio5(" erica  santos Oliveira ")
}

/*
RESOLUÇÃO DO PROFESSOR
fun exercicio5 (str : String): Int {
    return str.length
}

fun main (){
    println(exercicio5("abcdef") // 5
}
 */