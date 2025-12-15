/*
Exercicio 5 - Classificacao por Idade
Crie um programa que leia a idade de uma pessoa e classifique como:
- "Menor de idade" se for menor que 18
- "Adulto" se estiver entre 18 e 59
- "Idoso" se tiver 60 ou mais
Exemplo:
Digite sua idade: 45
Resultado: Adulto
*/
fun lerDadoDigitado(){
    print("Digite sua idade: ")
    var idadeUsuario = readln().trim().toInt()

    classificadorEtario(idadeUsuario)
}

fun classificadorEtario(idadeUsuario: Int){
    if(idadeUsuario < 18){
        print("Resultado: Menor de idade")
    } else if(idadeUsuario >= 18 && idadeUsuario <= 59){
        print("Resultado: Adulto")
    } else {
        print("Resultado: Idoso")
    }
}

fun main(){
    lerDadoDigitado()
}
