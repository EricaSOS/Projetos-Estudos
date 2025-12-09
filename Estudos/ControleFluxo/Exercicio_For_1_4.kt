/*
* EXERCÍCIO 01: Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
* "1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50"
*/
/*
* EXERCÍCIO 02: Imprima os números de 1 a 50 na mesma linha em ordem descrescente. Saída esperada:
* "50 49 48 47 .. .. .. 2 1"
*/
/*
* EXERCÍCIO 03: Usando a resolução do exercício 1, não imprima os números múltiplos de 5
*/
/*
* EXERCÍCIO 04: Faça a soma de todos os números no intervalo de 1 a 500*
*/

fun exercicio1(){
    for (contador in 1 .. 50 ){
        print("$contador ")
    }
}

fun exercicio2(){
    for (contador in 50 downTo 1 ){
        print("$contador ")
    }
}

fun exercicio3(){
    for (contador in 1 .. 50 ){
        if((contador%5)==0) {
            continue
        }
        print("$contador ")
    }
}

/*
fun exercicio3(){
    for (contador in 1 .. 50 ){
        if((contador%5)!=0) {
            print("$contador ")
        }
    }
}
 */

fun exercicio4(){
    var resultadoSoma: Int = 0
    for (contador in 1 .. 500 ){
        resultadoSoma += contador
    }
    print("$resultadoSoma")
}


fun main(){
    exercicio1()
    println("\n------------------------------------")
    exercicio2()
    println("\n------------------------------------")
    exercicio3()
    println("\n------------------------------------")
    exercicio4()
}