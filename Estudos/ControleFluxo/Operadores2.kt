/* Cálculo de bonus de funcionário baseado em tempo de empresa
Menos de um ano -> 500
1 a 3 anos -> 2000
4 anos ou mais -> 5000 */

fun bonusTempoEmpresa (tempo: Int): Float{
    var bonus = 0F
    if (tempo >= 4){
        bonus = 5000F
    } else if (tempo <= 3 && tempo >= 1){ // (tempo in 1 <=..<=3)
        bonus = 2000F
    } else if (tempo == 0) {
        bonus = 500F
    }
    return bonus
}

/* Aumentando o desafio: Inclusão da condição: Se for Diretor, a pessoa recebe o bonus de 10000 */

fun bonusTempoEmpresa3 (tempo: Int, cargo: String): Float{
    var bonus = 0F

    if (cargo == "Diretor"){
        bonus = 10000F
    } else {
        if (tempo >= 4){
            bonus = 5000F
        } else if (tempo <= 3 && tempo >= 1){ // (tempo in 1 <=..<=3)
            bonus = 2000F
        } else if (tempo == 0) {
            bonus = 500F
        }
    }
    return bonus
}

fun bonusTempoEmpresa4 (tempo: Int, cargo: String): Float{
    //Early return
    if (cargo == "Diretor"){
        return 10000F
    }
    if (tempo >= 4) {
        return 5000F
    } else if (tempo <= 3 && tempo >= 1) { // (tempo in 1 <=..<=3)
        return 2000F
    } else if (tempo == 0) {
        return 500F
    }
    return 0F
}

fun main(){
    print(bonusTempoEmpresa(0))
}