


fun countDigit(number: Int): Pair <Int, Int> {

    var count = 0

    var n = number
    var sum = 0

    while (n>0){
        val r = n % 10
        sum += r
        count++
        n /= 10

    }

    return Pair(count, sum)
}

fun reverseDigit(number: Int): Int
{
    var n = number
    var reverse = 0

    while (n>0){
        val r = n % 10
        reverse = reverse * 10 + r
        n /=10
    }
    return reverse
}


fun revString(word: String): String{

    var index = word.length - 1
    var reverse = ""

    while (index >=0 ){
        val char = word[index]
        reverse  += char
        index--
    }
    return reverse

}



fun main(){
//    val result  = countDigit(23432489)
//    println("Number of digit is ${result.first}")
//
//    println("The sum of the digit is ${result.second}")

//    var reverseResult = reverseDigit(54321)
//    println("The reverse of the number is $reverseResult")

    val reverseResult = revString("Hello")
    println("The reverse of the string is $reverseResult")


}