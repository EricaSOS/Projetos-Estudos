package Exercicios
/*
* Escreva um programa que tenha a capacidade de realizar operações aritméticas básicas, explicadas abaixo:
* - soma de dois números;
* - O valor da divisão de dois números;
* - O valor do resto da divisão de dois números;
* - O valor de inscrementar e decrementar uma variável (pré e pós incremento, pré e pós decremento).
* */

fun main() {
    var numero1: Int = 100
    var numero2: Int = 10
    var soma: Int = numero2 + numero1
    var divisao: Int = numero1 / numero2
    var restoDivisao: Int = numero1 % numero2

    println("O valor da soma entre ${numero1} e ${numero2} é ${soma}.")
    println("O valor da divisão entre ${numero1} e ${numero2} é ${divisao}.")
    println("O valor do resto da divisão entre ${numero1} e ${numero2} é ${restoDivisao}.")

    println("Pos ++: ${numero1++}.")
    println("Pre ++: ${++numero1}.")

    println("Pos --: ${numero1--}.")
    println("Pre --: ${--numero1}.")
}