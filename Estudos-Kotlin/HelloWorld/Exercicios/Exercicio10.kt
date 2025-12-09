package Exercicios

/*
* Escreva as funções do exercício 2, 3, 4 e 5 como funções de única linha.
* */


fun exercicioA (str: String): Int = str.length

fun exercicioB (numero: Double): Double = numero * numero * numero

fun exercicioC(distanciaMilhas: Double): Double = distanciaMilhas * 1.6

fun exercicioD(celsius: Double): Double = (celsius * 9/5) + 32

fun main (){
    println(exercicioA("abcdef")) // 6
    println(exercicioB(3.0)) // 27
    println(exercicioC(100.0)) // 160km
    println(exercicioD(0.0)) //32)
}