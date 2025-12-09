package Exercicios


/*
Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses,
dias horas, minutos e segundos. Saída desejada:
    2 ano(s) corresponde(m) a:
    24 meses
    730 dias
    17520 horas
    10512200 minutos
    63072000 segundos
*/

/* Minha resolução:
fun main() {
    println("Informe um valor em ano(s): ")
    val ano = 50
    println("$ano ano(s) corresponde(m) a:")
    println("${ano * 12} mes(es)")
    println("${ano * 365} dia(s)")
    println("${ano * 8760} hora(s)")
    println("${ano * 525600} minuto(s)")
    println("${ano * 31536000} segundo(s)")

}
 */

fun exercicio4(anos: Int){
    val meses = anos * 12
    val dias = anos * 365
    val horas = anos * 8760
    val minutos = anos * 525600
    val segundos = anos * 31536000

    println("$anos ano(s) corresponde(m) a:")
    println("$meses mes(es)")
    println("$dias dia(s)")
    println("$horas hora(s)")
    println("$minutos minuto(s)")
    println("$segundos segundo(s)")
}

fun main(){
    exercicio4(2)
}