/* Formas de fazer a mesma função:

FORMA 01: MENOS USADA
fun maiorDeIdade(idade: Int): Boolean{
    if (idade >= 18){
        return true
        // se parar aqui, vai dar erro, pois não fazemos a previsão da opção false
    } else {
        return false
    }
}

FORMA 02: é colocando return direto, sobre a avaliação da condição
fun maiorDeIdade(idade: Int): Boolean{
    return (idade >= 18)
}

FORMA 03: MAIS USADA
fun maiorDeIdade(idade: Int) = (idade >= 18)
 */

/*
fun main(){
    maiorDeIdade(15)
}
*/

/* DESAFIO: Escreva uma função que mostre o custo de um curso da faculdade: informática (500) e geografia (600)
 */
/*
fun mensalidadeCurso(curso: String): Double{
    if (curso == "Informática"){
        return 500.00
    } else if (curso == "Geografia") {
        return 600.00
    } else {
        return -1.0
    }
}
 */
fun mensalidadeCurso(curso: String): Double{
    var mensalidade = -1.0 // substitui o último else, pois se torna valor padrão

    if (curso == "Informática"){
        mensalidade = 500.00
    } else if (curso == "Geografia") {
        mensalidade = 600.00
    }
    return mensalidade
}

fun main(){
    print(mensalidadeCurso( "direito"))
}