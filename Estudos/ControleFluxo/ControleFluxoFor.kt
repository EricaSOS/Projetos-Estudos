/*
* For é laço de repetição, executa uma instrução até que uma condição seja satisfeita. Ele é capaz de percorrer
* um conjunto de elementos.
*
* Quando se fala em laço de repetição, há duas palavras que não podemos esquecer:
* break: sai do laço de repetição
* continue: é como se pulasse a condição dada e continuasse a execução do laço
* */



fun main(){
    for(meuValor in 1..10) { // basta escrever 1..10 que ele mesmo preenche os sinais. Do menor para maior
        print("$meuValor ")
    }
    println()

    for(valorDeDoisEmDois in 1..10 step 2) {
        print("$valorDeDoisEmDois ")
    }
    println()

    for(valorDecrescente in 10 downTo 1) {
        print("$valorDecrescente ")
    }
    println()

    val str = "Programação Kotlin"
    for(outroValor in str){
        print(outroValor)
    }
    println()
    //exemplo de break
    for(i in 1..10) {

        if(i == 5){
            break // pára a execução quando atender a condição e sai do laço
        }
        print("$i ")
    }
    println()

    //exemplo de continue
    for(c in 1..10) {

        if(c == 5){
            continue // pula para o próximo
        }
        print("$c ")
    }

}