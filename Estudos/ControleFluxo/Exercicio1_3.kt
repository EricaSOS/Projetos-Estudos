/*EXERCÍCIO 01:
* Escreva um programa para ajudar a empresa XPTO a calcular o bônus que os funcionários receberão no final do ano.
* Os bônus são classificados por cargo:
* a) Gerentes recebem R$ 2.000,00
* b) Coordenadores recebem R$ 1.500,00
* c) Engenheiros de software recebem R$ 1.000,00
* d) Estagiários recebem R$ 500,00*/

fun calculoBonus (cargo: String): Double {
    return if(cargo == "Gerente"){
        2000.00
    } else if(cargo == "Coordenador"){
        1500.00
    } else if(cargo == "Engenheiro"){
        1000.00
    }else if(cargo == "Estagiario"){
        500.00
    }else{
        0.00
    }
}

/*EXERCÍCIO 02:
* Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus:
* a) Gerentes com menos de 02 anos de experiência recebem R$ 2.000,00, caso contário recebem R$ 3.000,00;
* b) Coordenadores com menos de 01 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00;
* c) Engenheiros de software recebem R$ 1.000,00
* d) Estagiários recebem R$ 500,00*/

fun calculoBonus2 (cargo: String, tempoExperiencia: Int): Double {
    if(cargo == "Gerente"){
        if (tempoExperiencia < 2){
            return 2000.00
        } else if (tempoExperiencia >= 2){
            return 3000.00
        }
        return 0.00
    }
    if(cargo == "Coordenador"){
        if (tempoExperiencia < 1){
            return 1500.00
        } else if (tempoExperiencia >= 1){
            return 1800.00
        }
        return 0.00
    }
    if(cargo == "Engenheiro"){
        return 1000.00
    }
    if(cargo == "Estagiario"){
        return 500.00
    }
    return 0.00
}

/*EXERCÍCIO 03:
* Considerando os valores abaixo, diga o que retornará das seguintes expressões:
* val a = false
* val b = false
* val c = true
* val d = true
* a) a && b && c && d;
* b) !a && !b && (c && d);
* c) a && ((b || c) || d)
* d) a || ((!b && c) || !d)
*
* RESOLUÇÃO:
* a) F && F && T && T = F
* b) !F && !F && (T && T) = !F && !F && T = T && T && T = T
* c) F && ((F || T) || T) = F && (T || T) = F && T = F
* d) F || ((!F || T) || !T) = F || ((T || T) || !T) = F || (T || !T) = F || (T || F) = F || T = T
* */

val a = false
val b = false
val c = true
val d = true

fun main(){
    println(calculoBonus("Gerente"))
    println(calculoBonus("Coordenador"))
    println(calculoBonus("Engenheiro"))
    println(calculoBonus("Estagiario"))
    println(calculoBonus("Cozinheiro"))
    println("--------------------------------")
    println(calculoBonus2("Gerente", 0))
    println(calculoBonus2("Gerente", 2))
    println(calculoBonus2("Coordenador", 1))
    println(calculoBonus2("Coordenador", 0))
    println(calculoBonus2("Engenheiro", 0))
    println(calculoBonus2("Estagiario", 2))
    println(calculoBonus2("Cozinheiro", 10))
    println("--------------------------------")
    println(a && b && c && d)
    println(!a && !b && (c && d))
    println(a && ((b || c) || d))
    println(a || ((!b && c) || !d))
}