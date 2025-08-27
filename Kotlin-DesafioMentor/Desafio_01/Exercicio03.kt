fun lerDadosDigitados() { 
  println("Digite o primeiro número: ") 
  val primeiroNumero: Double = readLine().toString().trim().toDouble()
  
  println("Digite o segundo número: ") 
  val segundoNumero: Double = readLine().toString().trim().toDouble() 
  
  println("Digite a operação (+, -, *, /): ") 
  val operador: String = readLine().toString().trim() 

  calcular(primeiroNumero, segundoNumero, operador) 
}

fun calcular(primeiroNumero: Double, segundoNumero: Double, operador:String): Double?{ 
  val resultado = when (operador) { 
    "+" -> primeiroNumero + segundoNumero 
    "-" -> primeiroNumero - segundoNumero 
    "*" -> primeiroNumero * segundoNumero 
    "/" -> { 
      if (segundoNumero != 0.0) { 
      primeiroNumero/segundoNumero 
      } else { 
        println("Erro: Divisão por zero não é permitida.")
        null 
      } 
    } 
    else -> { 
      println("Erro: Operador inválido.") null 
    } 
  } 
  return resultado 
}

fun imprimirResultado(){ 
  println("Resultado: $resultado") 
} 

fun main(){ 
  imprimirResultado() 
}
