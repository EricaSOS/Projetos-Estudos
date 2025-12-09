package Exercicios/*
* Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras
* "a" ou "A" por "x".
* a. Não deve existir lógica dentro da função Exercicios.main. Deve ser usada somente como ponto de entrada.
* b. Escrever uma função para ler a string.
* c. Escrever uma função para a troca de letras e impressão do valor final.
* d. String final deve estar com todas as letras minúsculas
* */
fun lerString(){
    print("Por favor, informe o texto: ")
    val palavrasOriginais = readLine()
    trocarLetras(palavrasOriginais.toString())
}

fun trocarLetras(palavrasOriginais: String){
    val palavrasRevisadas = palavrasOriginais.lowercase().replace("a", "x")
    println(palavrasRevisadas)
}

fun main (){
    lerString()
}