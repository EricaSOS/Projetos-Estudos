/*
* Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício apra incentivar
* os funcionários a pouparem dinheiro para a aposentadoria, que funciona da seguinte maneira:
*
* Se o funcionário destinar 5% do seu salário para investimento, a empresa acrescenta o mesmo valor. Ou
* seja, caso o funcionário invista 100 reais, a empresa investe mais 100. Este fundo de investimento
* possui rendimento de 0,2% ao mês.
*
* Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta
* própria, já que conhece investimentos que rendem mais que 0,2% ao mês.
*
* Paula vai escolher investimentos que rendem 0,8% ao mês. Considere o salário de Ana e Paula iguais
* e no valor de 10 mil reais e que as duas estão começando com saldo de 0 e que investirão 5% do salário.
*
* Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?*
*
* */

fun comparar(){
    val salario = 10000F
    var quantidadeMeses = 1
    var patrimonioAna = 0F
    var patrimonioPaula = 0F

    do{
        patrimonioAna += (0.05F * salario) + (0.05F * salario) + (patrimonioAna * 0.002F)
        patrimonioPaula += (0.05F * salario) + (patrimonioPaula * 0.008F)
        quantidadeMeses++
    } while (patrimonioPaula < patrimonioAna)

    println("Paulaultrapassará o patrimônio de Ana, no mês $quantidadeMeses .")
}


fun main(){
    comparar()
}