/*
Exercicio 3 - Calculadora Simples
Crie um programa que receba dois numeros e um operador (+, -, *, /) e retorne o resultado da operacao.
Exemplo:
Digite o primeiro numero: 5
Digite o segundo numero: 2
Digite a operacao (+, -, *, /): *
Resultado: 10
*/
fun lerDadosDigitados() {
    println("Digite o primeiro número: ")
    val primeiroNumero: Double = readLine().toString().trim().toDouble()

    println("Digite o segundo número: ")
    val segundoNumero: Double = readLine().toString().trim().toDouble()

    println("Digite a operação (+, -, *, /): ")
    val operador: String = readLine().toString().trim()

    val resultado = calcular(primeiroNumero, segundoNumero, operador)
    println("Resultado: $resultado")
}

fun calcular(primeiroNumero: Double, segundoNumero: Double, operador:String): String{
    return when (operador) {
        "+" -> (primeiroNumero + segundoNumero).toString()
        "-" -> (primeiroNumero - segundoNumero).toString()
        "*" -> (primeiroNumero * segundoNumero).toString()
        "/" -> {
            if (segundoNumero != 0.0) {
                (primeiroNumero/segundoNumero).toString()
            } else {
                "Erro: Divisão por zero não é permitida."
            }
        }
        else -> "Erro: Operador inválido."
    }
}

fun main(){
    lerDadosDigitados()
}
fun main(){ 
  imprimirResultado() 
}
