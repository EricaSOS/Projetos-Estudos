/*
Exercicio 4 - Validador de Senha
Crie uma funcao que valide uma senha com base nas seguintes regras:
- Ter pelo menos 8 caracteres
- Conter pelo menos uma letra maiuscula
- Conter pelo menos um numero
- Nao conter espacos
Exemplo de retorno:
Digite a senha: MinhaSenha123
Senha valida: true
*/

fun validarSenha(senha: String){
    var tamanhoSenha: Int = senha.length
    var contemLetraMaiuscula: Boolean= senha.any{it.isUpperCase()}
    var contadorNumero: Boolean = senha.any{it.isDigit()}
    var contemEspaco: Boolean = senha.contains(" ")


    if ((tamanhoSenha >=8) && (contemLetraMaiuscula === true) && (contadorNumero === true) && (contemEspaco === false)){
         println("Senha valida: true")
    } else {
        println("Senha valida: false")
    }
}

fun receberSenha(){
    print("Digite a senha: ")
    var senha = readln().toString()
    validarSenha(senha)
}

fun main(){
    receberSenha()
}
