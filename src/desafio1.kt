fun main() {
   //1° Sequencia de Fibonacci
    println("Digite um número para verificar se ele pertence á sequência de Fibonacci: ")
    val number = readLine()?.toIntOrNull() ?: 0

    if(number < 0){
        println("O número tem que ser positivo")
    }else{
        var fibonacciFunction = fibonacciFunction(number)
        println("O número $number ${if (fibonacciFunction) "pertence" else "não pertence"} à sequência de Fibonacci.")
    }

}

fun fibonacciFunction(number: Int): Boolean {
    var a = 0
    var b = 1
    var c = a + b

    while (c <= number) {
        if (c == number) return true
        a = b
        b = c
        c = a + b
    }
    return false
}