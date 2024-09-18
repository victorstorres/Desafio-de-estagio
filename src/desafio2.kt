fun main() {
    println("Digite uma frase")
    val word = readLine().toString()
    val count = countLetterA(word)
    println("Contem  ${count.first} a maisculos ")
    println("Contem  ${count.second} a minusculos ")

}


fun countLetterA(word: String): Pair<Int, Int> {
    var upperCaseA = 0
    var lowerCaseA = 0


    for (letter in word) {
        when(letter) {
            'A' -> upperCaseA++
            'a' -> lowerCaseA++
        }
    }

    return upperCaseA to lowerCaseA
}