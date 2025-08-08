/* Exercicio 1 - Contagem de Cedulas
Leia um valor inteiro. A seguir, calcule o menor numero de notas possiveis no qual o valor pode ser decomposto. As notas consideradas sao: 100, 50, 20, 10, 5, 2 e 1. 
Ao final, mostre o valor lido e a relacao de notas necessarias. Exemplo de retorno:
576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00
* */

fun validarValorDigitado(): Int? {
    print("Digite um valor inteiro: ")
    val valorDigitado = readLine().toString().trim()
    val valorUsuario = valorDigitado.toIntOrNull()
    return if (valorUsuario != null && valorUsuario >= 0) {
        valorUsuario
    } else {
        println("Dado inválido.")
        null
    }
}

fun contadorCedulas(){
    val valorUsuario = validarValorDigitado()
    var valorDecomposto = valorUsuario
    
      if(valorDecomposto != null){
        val qtdeCedula100 = (valorDecomposto / 100)
        valorDecomposto = valorDecomposto % 100

        val qtdeCedula50 = (valorDecomposto / 50)
        valorDecomposto = valorDecomposto % 50

        val qtdeCedula20 = (valorDecomposto / 20)
        valorDecomposto = valorDecomposto % 20

        val qtdeCedula10 = (valorDecomposto / 10)
        valorDecomposto = valorDecomposto % 10

        val qtdeCedula5 = (valorDecomposto / 5)
        valorDecomposto = valorDecomposto % 5

        val qtdeCedula2 = (valorDecomposto / 2)
        valorDecomposto = valorDecomposto % 2

        val qtdeCedula1 = (valorDecomposto / 1)
        valorDecomposto = valorDecomposto % 1

        println(valorUsuario)
        println("$qtdeCedula100 nota(s) de R$ 100,00")
        println("$qtdeCedula50 nota(s) de R$ 50,00")
        println("$qtdeCedula20 nota(s) de R$ 20,00")
        println("$qtdeCedula10 nota(s) de R$ 10,00")
        println("$qtdeCedula5 nota(s) de R$ 5,00")
        println("$qtdeCedula2 nota(s) de R$ 2,00")
        println("$qtdeCedula1 nota(s) de R$ 1,00")
    }
}

fun main (){
    contadorCedulas()
}
