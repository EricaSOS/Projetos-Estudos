fun main(){
    val str = "15"
/*
    str.toByte()
    str.toLong()
    str.toInt()
    str.toShort()
    str.toFloat()
    str.toDouble()
*/
    println(str.toLong())

    val abc = "true"

    abc.toBoolean()
    // se licar em cima do nome da função e pressionar ctrl + q, aparece para que serve.
    // como ctrl + b, você lê os comentários pertinentes a função, abrindo o arquivo

    val a: Byte = 0
    val b: Short = 5
    val c: Int = 10
    val d: Long = 15L
    val e: Float = 20F
    val f: Double = 25.0

    //todas as variáveis de tipos numéricos, conseguem ser convertidas para as de tipo maiores (capacidade maior)
    a.toShort()
    //o contrário pode gerar problemas
    println(f.toInt())
    //nos casos de Short e Byte, primeiro converto para Int e depois para eles.
    println(f.toInt().toShort()) //os valore virão errados (pegamos um quarto e colocamos numa caixinha de fósforo)
    println(f.toInt().toByte()) //os valore virão errados (pegamos um quarto e colocamos numa caixinha de fósforo)
    // o problema é a perda da precisão, tem como tratar.

    // conversão de número para string consigo
    println(a.toString())
}