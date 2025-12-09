/*
fun helloWorld(){
    println("Olá, Mundo!")
}
*/
/*
fun helloWorld(nome: String){
    println("Olá, ${nome}!")
}
*/

/*
* Escopo da função: Tudo o que está dentro das chaves, do trecho ou bloco de código;
* Quando uma variável é declarada dentro do escopo de uma função, ela não fica disponível para as demais.
* Nesse caso, o que a outra função pode fazer e chamar outra função.
* */

fun media(numero1: Int, numero2: Int): Int{
    val media1 = (numero1 + numero2)/2
    return media1
}

fun main () {
    //helloWorld("Gabriel")
    println(media(3, 4)) // print da função media
}

//FUNCOES DE UMA LINHA (quando há apenas uma linha de instrução
/*
fun helloWorld(){
    println("Olá, Mundo!")
}
É o mesmo que:
*/

fun helloWorld() = println("Olá, Mundo!")

/*
fun media(numero1: Int, numero2: Int): Int{
    val media1 = (numero1 + numero2)/2
    return media1
}

Posso reescrever para ser uma linha de instrução:

fun media(numero1: Int, numero2: Int): Int{
    return (numero1 + numero2)/2
}

 Quando transformo em função de única linha, fica assim:
 */

fun mediaConv(numero1: Int, numero2: Int): Int = (numero1 + numero2)/2
fun soma(numero1: Int, numero2: Int) = numero1 + numero2  //posso suprimir o tipo do resultado ": Int"
