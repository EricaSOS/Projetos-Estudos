fun main() {
    val soma = 2 + 2
    val subtracao = 2 - 2
    val multiplicacao = 2 * 10
    val divisao = 100/5
    val resto = 10 % 3
    var abc = 10
    // println(soma)
    // println(subtracao)
    // println(multiplicacao)
    // println(divisao)
    // println(resto)
    /*
        INCREMENTO E DECREMENTO
        valor += 15
        é o mesmo que escrever "valor = valor + 15" incrementa 15
        esse tipo de anotação funciona para qualquer outro tipo de operação: -=; *=; /=; %=

        valor++ >>> é o mesmo que escrever "valor = valor + 1" ou "valor+=1" incrementa 1
        valor-- >>> é o mesmo que escrever "valor = valor - 1" ou "valor-=1" decrementa 1
        ++valor >>> é o mesmo que escrever "valor = valor - 1" ou "valor-=1" decrementa 1
        --valor >>> é o mesmo que escrever "valor = valor - 1" ou "valor-=1" decrementa 1
    */
    println(abc++) //primeiro mostro a variável com valor 10 e depois incremento 1
    println(abc--) //primeiro mostro a variável incrementada com valor 11 e depois decremento 1
    println(++abc) //primeiro incremento 1 e depois mostro a variável com valor incrementado 11
    println(--abc) //primeiro decremento 1 e depois mostro a variável com valor decrementado 10
    // esse tipo de anotação é apenas para adição e subtração, somente com uma unidade

    // expressão: linha de código executável
    // instrução: linha de código executável

    var result = 2 + 3 * 4
    println("Resultado é: ${result}.")

    /* Ordem de prioridade:
    1º) Parênteses;
    2º) * / %;
    3º) + -;
     */

}