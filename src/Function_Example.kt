



fun john()
{
//    task to execute
    println("Water the plant.")
    println("Completed")
}

fun delta(){
    println("Delta : You are assigned to lead the Team.")
}


fun sayHello(){
    println("Hello, How are you?")
}

fun buyGroceries(money: Int, things: String ): String {
    println("OK")
    println("I am going to buy $things for $money euros")
    println("Done")

    return "Take $things for $money euro"
}


fun main(){
    println("HI, I am a Main Function.")
    john()
    delta()
    sayHello()
    var result = buyGroceries(3, things = "Milk")
    println(result)
    println(result.length)
}