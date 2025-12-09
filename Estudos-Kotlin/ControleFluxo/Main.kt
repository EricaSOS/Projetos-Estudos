//if (condição){código}

fun ehManha(manha: Boolean){
    if (manha){
        println("Acorde!")
    }
}


fun main(){
    ehManha(true)
    ehManha(false)

    val str = "Programação Kotlin"
    if (str.contains("Kotlin")){
        println("Texto contém Kotlin!")
    }
}
