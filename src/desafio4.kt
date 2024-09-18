fun main() {
    //A
    println("Desafio A")
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println("")
    //B
    println("Desafio B")
    var number =2
    for (i in 1..6) {
        number *= 2
        print("$number ")
    }
    println("")
    //C
    println("Desafio C")
    for (i in 1..7) {
        print("${i * i} ")
    }
    println("")
    //D
    println("Desafio D")
    for (i in 2 .. 10 step 2) {
        print("${i * i} ")
    }
    println("")
    //E
    println("Desafio E")
    var a = 1
    var b = 1
    for (i in 1..7) {
        print("$a ")
        val temp = a
        a = b
        b = temp + b
    }

}

