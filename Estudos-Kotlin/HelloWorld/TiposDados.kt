/*
Type       Bit             Intervalo
Double      64             [1.7976931348623157 x 10^308, 4.9406564584124654 x 10^(-324)]
                           (dado numérico que aceita ponto flutuante, é mais preciso que
                            o float para cálculos de precisão)
Float       32             [3.40282347 x 10^(38), 1.40239846 x 10^(-45)]
                           (dado numérico que aceita ponto flutuante)
Long        64              [(-9,223,372,036,854,775,808) .. (9,223,372,036,854,775,807)] (dados numéricos inteiros)
Integer     32              [(-2,147,483,648) ... (2,147,483,647] (dados numéricos inteiros)
Short       16              [(-32,768) .. (32,767)] (dados numéricos inteiros)
Byte        8               [-128 .. 127] (dados numéricos)
Character   16              - (tem que ser aspa simples, um elemento e pode ser número, letra ou símbolos)
String      ?               - (tem que ser aspa dupla e pode ser número ou letra) = conjunto de caracteres
                            O tamanho será do conteúdo
Boolean     ?               [0,1] (verdadeiro ou falso)
                            O tamanho será definido pela JVM durante a execução
                            (verificar documentação da versão)
 */
fun main() {
   /** var b: Boolean = false
    var str: String = "Olá, mundo!"
    var c: Char = '8'
    var f: Float = 10.5F
    var d: Double = 10.8752758
    var abc = 150 //integer
    var abd: Int = 150
    var lon = 2147483647 //long pois está acima do limite da integer
    var lon2: Long = 150L
    var dado: Byte = 10
    var s: Short = 15 */
    println("Double.MIN_VALUE: ${Double.MIN_VALUE} a Double.MAX_VALUE: ${Double.MAX_VALUE}")
    println("Float.MIN_VALUE: ${Float.MIN_VALUE} a Float.MAX_VALUE: ${Float.MAX_VALUE}")
    println("Long.MIN_VALUE: ${Long.MIN_VALUE} a Long.MAX_VALUE: ${Long.MAX_VALUE}")
    println("Integer.MIN_VALUE: ${Integer.MIN_VALUE} a Integer.MAX_VALUE: ${Integer.MAX_VALUE}")
    println("Short.MIN_VALUE: ${Short.MIN_VALUE} a Short.MAX_VALUE: ${Short.MAX_VALUE}")
    println("Byte.MIN_VALUE: ${Byte.MIN_VALUE} a Byte.MAX_VALUE: ${Byte.MAX_VALUE}")
}