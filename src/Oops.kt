//
//
//open class Person(var name: String, var age: Int, var salary: Double){
//    init {
//        println("My name is $name")
//        println("My age is $age")
//        println("My salary is $salary")
//    }
//
//
//}
//
//class WebDeveloper(name: String, age: Int, salary: Double, var language: String) : Person(name, age, salary){
//
//    fun buildWeb(){
//        println("I build the website.")
//        println("My tech language is $language")
//    }
//}
//
//
//class AndroidDeveloper(name: String, age: Int, salary: Double) : Person(name, age, salary){
//    fun buildAnd(){
//        println("I build the android applications.")
//    }
//}
//
//class IosDeveloper(name: String, age: Int, salary: Double) : Person(name, age, salary){
//    fun buildIos(){
//        println("I build the Ios applications.")
//    }
//}
//
//fun main(){
//    val w1 = WebDeveloper("Utsaha Joshi", age = 33, salary = 3500.00, language = "JavaScript")
//    w1.buildWeb()
//
//    println()
//    val a1 = AndroidDeveloper(name = "Aditya Joshi", age = 29, salary = 3200.00)
//    a1.buildAnd()
//}
//
//
//
//
