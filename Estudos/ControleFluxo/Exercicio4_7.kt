/*EXERCÍCIO 04:
* Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura geométrica.
* Informar se formam um quadrado (lados iguais).
* */

fun quadrilatero() {
    print("Informe o comprimento do Lado 01: ")
    var lado1 = readLine().toString().toInt()
    print("Informe o comprimento do Lado 02: ")
    var lado2 = readLine().toString().toInt()

    if(lado1 == lado2){
        return println("É um quadrado.")
    } else {
        return println("Não é quadrado.")
    }
}

/* EXERCÍCIO 05:
* Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo.
* Informar se é um triângulo equilátero (todos os lados iguais).
* */
fun triangulo(){
    print("Informe o comprimento do Lado 01: ")
    var lado1 = readLine().toString().toInt()
    print("Informe o comprimento do Lado 02: ")
    var lado2 = readLine().toString().toInt()
    print("Informe o comprimento do Lado 03: ")
    var lado3 = readLine().toString().toInt()

    if(lado1 == lado2 && lado1 == lado3){
        return println("Triangulo Equilátero.")
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
        return println("Triangulo Isóceles.")
    } else {
        return println("Triangulo Escaleno.")
    }
}

/* EXERCÍCIO 06:
* Considere o código abaixo. Qual a saída do programa caso informado o valor 4
*
* fun qualASaida(num: Int){
*       if(num >= 0){
*           if(num == 0)    // quando tem uma instrução só em seu corpo, não precisa das chaves, mas as boas praticas pedem para ter
*               println("Primeira string")
*           else println("Segunda string")
*       }
*       println("Terceira string")
* }
*
* RESPOSTA: Ou dará erro, pois o IF está sem as chaves ou cairá na segunda string
* */

fun qualASaida(num: Int){
    if (num >= 0) {
        if (num == 0) {
            println("Primeira string")
        } else {
            println("Segunda string")
        }
    }
    println("Terceira string")
}

/* EXERCÍCIO 07:
* Escreva um programa para ser usado na portaria de um evento.
* a) Peça a idade. Menores de idade n]ao são permitidos. Mensagem: "Negado. Menores de idade não são permitidos.";
* b) Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
* destes. Mensagem: "Negado. Convite Inválido.";
* c) Peça o código do convite. Convites premium e luxo começam com "XL". Convites comuns começam com "XT".
* Caso o código não esteja nos padrões, negar a entrada. Mensagem: "Negado. Convite inválido."
* d) Caso todos os critérios sejam satisfeitos, exibir "Welcome :)"
* */

/*
fun portariaEvento(idade: Int, tipoConvite: String, codigoConvite: String): String{

    if(idade < 18){
        return "Negado. Menores de idade não são permitidos."
    }
    if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo"){
        return "Negado. Convite Inválido.1"
    }

    if (codigoConvite.startsWith("XL") || codigoConvite.startsWith("XT")){
        return "Welcome :)"
    } else{
        return "Negado. Convite inválido.2"
    }
}
 */
/*
fun portariaEvento( ){
    print("Informe sua idade (anos): ")
    var idade = readLine().toString().toInt()
    var mensagem: String
    if(idade < 18){
        mensagem = "Negado. Menores de idade não são permitidos."
        return println(mensagem)
    }

    println("Informe o tipo de convite (comum, premium ou luxo): ")
    var tipoConvite = readLine().toString().lowercase()
    if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo"){
        mensagem = "Negado. Convite Inválido.1"
        return println(mensagem)
    }

    println("Digite o código do convite: ")
    var codigoConvite = readLine().toString().uppercase()
    if (codigoConvite.startsWith("XL") || codigoConvite.startsWith("XT")){
        mensagem = "Welcome :)"
        return println(mensagem)
    } else {
        mensagem = "Negado. Convite Inválido.2"
        return println(mensagem)
    }
}
 */

fun portariaEvento( ): String{
    print("Informe sua idade (anos): ")
    var idade = readLine().toString().toInt()
    if(idade < 18){
        return "Negado. Menores de idade não são permitidos."
    }

    println("Informe o tipo de convite (comum, premium ou luxo): ")
    var tipoConvite = readLine().toString().lowercase()
    if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo"){
        return "Negado. Convite Inválido.1"
    }

    println("Digite o código do convite: ")
    var codigoConvite = readLine().toString().uppercase()
    return if (((tipoConvite == "premium" || tipoConvite == "luxo") && codigoConvite.startsWith("XL")) ||
        (tipoConvite == "comum" && codigoConvite.startsWith("XT"))){
        "Welcome :)"
    } else {
        "Negado. Convite Inválido.2"
    }
}



fun main(){
   /* quadrilatero()
    println("----------------------------------------")
    triangulo()
    println("----------------------------------------")
    println(qualASaida(4))
    println("----------------------------------------") */

    /*println(portariaEvento(18, "luxo","XT00000"))
    println(portariaEvento(17, "comum","XT00000"))
    println(portariaEvento(30, "nenhum","XT00000"))
    println(portariaEvento(18, "luxo","XL00000"))
    println(portariaEvento(18, "luxo","00000"))*/
    println(portariaEvento())
}