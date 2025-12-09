package Exercicios/*
* Escreva uma função capaz de receber Celsius e converter Fahrenheit.
* F = (C * 9/5) + 32
* */

fun exercicio8(celsius: Double){
    val fahrenheit = (celsius * 9/5) + 32
    println("$celsius ° corresponde a $fahrenheit Fahrenheit")
}

fun main (){
    exercicio8(0.0) //32
}