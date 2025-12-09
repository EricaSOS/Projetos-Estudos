package Exercicios/*
* Escreva uma função que seja capaz de receber milhas e converter em km (1milha = 1,6Km).
* */

fun exercicio7(distanciaMilhas: Double): Double{
    return distanciaMilhas * 1.6
}

fun main(){
    println(exercicio7(100.0)) // 160km
}