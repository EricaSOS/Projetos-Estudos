import java.util.Locale

// String é um conjunto de caracteres
// nomes de variaveis devem ser nomeadas conforme as suas responsabilidades

fun main() {
    val nome = "John"
    println("Olá, $nome")

    //Função format funciona substituindo algo
    // %s indica um placeholder = algo que está reservando lugar. É usado para strings
    println("Olá, %s".format(nome))
    //%s - String
    //%d - Int
    //%f - Ponto Flutuante
    //%c - Char
    //%b - Boolean

    //posso repetir o placeholder
    println("Olá, %s %s".format(nome, nome))

    val value = 5
    val salario = 16855.95

    println("Valor: %d - Salário: %f".format(value, salario)) //inserir na ordem correta
    println("Valor: %2d - Salário: %f".format(value, salario)) // fica com espaço na frente de cinco
    println("Valor: %02d - Salário: %f".format(value, salario)) // inclui um zero no lugar do espaço
    println("Valor: %02d - Salário: %.2f".format(value, salario)) // agora teremos apenas duas casas decimais

    //para mudar a forma de representação das cadas decimais de vírgula por ponto, utilizo o locale
    println("Valor: %02d - Salário: %.2f".format(Locale.US, value, salario))
}
