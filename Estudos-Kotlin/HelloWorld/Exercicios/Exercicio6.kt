package Exercicios/*
* Escreva uma função que seja capaz de calcular o cubo de um número (cubo = n*n*n).
* */


fun exercicio6 (numero : Int) {
    val cuboNumero = numero * numero * numero
    println("O cubo do numero $numero é $cuboNumero")
}

fun main (){
    exercicio6(5)
}

/*
RESOLUÇÃO DO PROFESSOR
fun exercicio6 (numero : Double): Double {
    return numero * numero * numero
}

fun main (){
    exercicio6(3.0) // 27
}
 */