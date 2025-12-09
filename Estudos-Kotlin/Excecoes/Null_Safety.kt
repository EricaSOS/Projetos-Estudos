/* Exceção é um comportamento inesperado e o programa não sabe responder. Por isso, se não tratada
o programa encerra, quebra.

Vamos iniciar com o primeiro tipo: Null Safety
- Para isso, devemos ver primeiro a exceção do tipo NullPointerException. Para rodar Java, precisamos
 preparar o projeto:
    Para criar a pasta Java, basta ir na pasta Main, clique: New > Diretório > Java;
    Crie um arquivo java class, na pasta Java criada.
- Ver ExemploExcecao.java
 */

fun main(){

    /* Se eu tentar declarar a "val str: String = null", haverá um erro, pois o Kotlin tenta ao máximo
    evitar valores nulos nas variáveis, esse é o conceito de Null Safety do Kotlin. Mas essa regra é
    flexível, bastando colocar a "?" ao lado do tipo da variável.
    Essa flexibilização, é para facilitar a interação do Kotlin com o Java, uma vez que esse último
    aceita a atribuição de valores nulos.
     */
    val str: String? = null
    /*quando utilizo a possibilidade de retorno de uma variável nula, eu tenho algumas consequencias
    como não poder utilizar algumas propriedades (length) e preciso tratar os erros que darão, por exemplo,
    colocando a "?" após o nome da variável, para conseguir acessar a propriedade e não levar uma exceção.
     */
    println(str?.length) // RECOMENDADO. Em java, daria exceção
    println(str!!.length) // NÃO RECOMENDADO
    // outra forma é a utilização do !!, que é quando a gente garante que o valor
    // nunca será nulo. Como vamos tratar o valor, eu digo ao Kotlin que se for, pode lançar exceção.
    // Aqui a pessoa assume o risco.

    //Outra forma de tratar é usando o controle de fluxo ou desvio condicional

    val abc = readLine()
    if(abc != null){
        abc.toShort() // não precisa colocar o ".toString"
    } else {
        print("Informe um valor válido.")
    }

}