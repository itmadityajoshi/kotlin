//fun main (){
//    for (i in 0 .. 10 step 3){
//        println(i)
//    }

//    for (i in 10 downTo 1){  //this down print the number from 10 to 1 in downwards.
//        println(i)
//    }


//    for (i in 1 .. 10){
//        println("i = $i")
//    }


//    for (i in 1 until  10){
//        println("i = $i")
//    }
    //wap to take a number from a user and count the digit.
//        println("Enter the Number of your choice: ")
//        var number: Int = readln().toInt()
//
//        var count_digit = number.toString().length
//
//        println("The length of your number is: $count_digit")
//

//    println("Enter Number : ")
//    val number: Int = readln().toInt()
//    reverseNumber(number)
//}
//
//
//
//fun reverseNumber(number: Int){
//    //reverse logic
//    var n = number
//    var rev: Int = 0
//    while ( n != 0) {
//        val r = n % 10
//        rev = rev * 10 + r
//        n = n / 10
//    }
//
//    println("Reverse is $rev")
//
//}

//wap to take number from user and check prim number



fun checkPrime(number: Int): Boolean {
    val n = number
    var factorCount = 0
    for (i in 1 .. n){
        if (n % i == 0){
            factorCount++
        }
    }
    println("factors : $factorCount")
    if (factorCount ==2)
        return true

    else
        return false

}



fun main(){
    println("Enter Number:")
    val number: Int = readln().toInt()
    if (checkPrime(number)){
        println("The number is a prime.")
    }else
    {
        println("The number is not a prime.")
    }

}


























