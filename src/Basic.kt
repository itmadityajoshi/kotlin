
 var surname: String = "Joshi"

fun main(){
    val message = "Ultimate kotlin Coding."
    println(message)

    var  score = 10
    score = 5

    println(score)

//    var name: String = "Aditya"
//    if (name != null) {
//        println("Hello, $name!")
//    }
//    println(name?.length ?: "No name, no length!")

    println(surname)

//   null saftey : safe call

    var nickname: String? = null // to allow null, we add a ?.
//    nickname = null

    println(nickname)
    println(nickname?.length) // prints:null



    //Elvis operator ?: gives a default when the values is null
    println(nickname?.length ?: 0)
}

