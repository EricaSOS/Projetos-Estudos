/* O controle de fluxo WHEN é usado quando se tem um intervalo conhecido de valores para uma variável.
* Estrutura/Sintaxe: When (variável) {
*                       listo os valores que ela poderá assumir
*                       1 -> {o que fazer se a variável for 1}
*                       2 -> {o que fazer se a variável for 2}
*                       else -> {o que fazer se não for nenhuma das condições}
*                    }
* Tudo o que faço com If consigo fazer com When e vice-versa. Não há diferença na execução u no resultado final
 */

fun bonus(cargo: String): Float{
    return when (cargo) {
        "Gerente" -> {
            2000F //coloquei o return lá em cima
        }
        "Coordenador" -> { // se fosse número ou tivesse um intervalo, seria in 2 <= .. <= 9
            1500F
        }
        else -> {
            0F
        }
    }
}

fun main(){
    print(bonus("Gerente"))
}


