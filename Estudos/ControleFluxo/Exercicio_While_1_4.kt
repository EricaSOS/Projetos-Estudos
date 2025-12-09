/*
* EXERCÍCIO 01: Considere uma caixa d'agua de 2 mil litros. Rômulo gostaria de encher a caixa d'agua
* com balões de água de 7 litros. Quantos balões cabem na caixa d'água sem que o volume seja excedido?
* */

/*
* EXERCÍCIO 02: FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
*  a) Quando um número for divisível por 3, imprimir Buzz;
*  b) Quando um número for divisível por 5, imprimir Fizz;
*  c) Quando um número for divisível por 3 e 5, imprimir FizzBuzz
* */

/*
* EXERCÍCIO 03: Escreva um programa capaz de receber um texto e imprimi-lo invertido.
* Entrada: Meu nome é Jilius.       Saída: .suiliJ é emon ueM
* */

/*
* EXERCÍCIO 04: Escreva uma função que recebe uma string, verifica se existe a mesma
* quantidade de caracteres 'x' e 'o' e retorna true ou false. Caso não exista nem 'x' nem 'o',
* retornar false.
* "xxooox" -> true    "xxxxo" -> false  "bdefghjij" -> false     "ooooxzzzzzz" -> false
* */

fun exercicioA(){
    var caixaDeAgua: Int = 2000
    val balaoDeAgua: Int = 7
    var contadorDeBaloes: Int = 0

    while ((caixaDeAgua - balaoDeAgua) >= 0) {
        caixaDeAgua = caixaDeAgua - balaoDeAgua
        contadorDeBaloes = contadorDeBaloes + 1
    }

    print("Cabem $contadorDeBaloes balões na caixa d'água.")
}

/*
* fun exercicioA2(){
*   val capacidadeCaixa = 2000
*   val volumeBalao = 7
*   var numeroBaloes = 0
*       while((volumeBalao * numeroBaloes) + volumeBalao <= capacidadeCaixa){
*           numeroBaloes++
*       }
*   print("Cabem $numeroBaloes balões na caixa d'água.")
* }
* */


fun exercicioB() {
    var numero: Int = 1
    while (numero in 1 .. 50){
        if((numero % 3 == 0) && (numero % 5 == 0)){
            print("FizzBuzz ")
            numero++
        } else if((numero % 5 == 0)){
            print("Fizz ")
            numero++
        } else if((numero % 3 == 0)) {
            print("Buzz ")
            numero++
        } else{
            print("$numero ")
            numero++
        }
    }
}


fun exercicioC(){
    print("Digite o texto a ser invertido: ")
    var textoInvertido = readLine().toString().reversed()
    print(textoInvertido)
}
/*
fun exercicioC2(){
    print("Digite o texto a ser invertido: ")
    val textoOriginal = readLine().toString()
    var textoInvertido = ""
    var indice: Int = textoOriginal.length-1

    while (indice >= 0){
       textoInvertido = textoInvertido + textoOriginal[indice]
       indice--
    }
        println("O texto invertido é: $textoInvertido")
}

RESOLUÇÃO DO PROFESSOR

fun exercicioC3(){
    print("Digite o texto a ser invertido: ")
    val textoOriginal = readLine().toString()
    var length = textoOriginal.length

    while (length > 0){
       println(str[length - 1])
       length--
    }
}

 */


fun exercicioD(): Boolean{
    println("Digite um texto: ")
    val textoUsuario = readLine().toString().lowercase().trim()

    var indice: Int = 0
    var quantidadeX: Int = 0
    var quantidadeO:Int = 0

        /*
        var length = textoUsuario.length
        while (length > 0){ // percorre do final para o início da string

            if (textoUsuario[length -1] == 'x'){
                quantidadeX++
            } else if (textoUsuario[length -1] == 'o'){
                quantidadeO++
            }
            length--
        }
        */
        while (indice < textoUsuario.length){ // percorre do início ao final da string
            if (textoUsuario[indice] == 'x'){
                quantidadeX++
            } else if (textoUsuario[indice] == 'o'){
                quantidadeO++
            }
            indice++
        }

        if(quantidadeO == quantidadeX && quantidadeO > 0){
            return true
        } else {
            return false
        } // ou apenas faço o return (quantidadeO == quantidadeX && quantidadeO > 0)
}

fun main(){
/*
    exercicioA()
    println("\n-------------------------------")
    exercicioB()
    println("\n-------------------------------")
    exercicioC()
    println("\n-------------------------------")

    exercicioC2()
    println("\n-------------------------------")
    */

//    exercicioD()
}
