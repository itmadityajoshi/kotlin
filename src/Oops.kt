//class Person(val name: String, var age: Int) {
//
//    fun introduce() {
//        println("Hi, I'm $name and I'm $age years old.")
//    }
//}
//
//fun main() {
//    val p1 = Person("Aditya", 25)   // no "new" keyword in Kotlin
//    p1.introduce()                  // Hi, I'm Aditya and I'm 25 years old.
//    p1.age = 26                     // var can change, val cannot
//}

/*
Inheritance is one of the key features of object-oriented programming. It allows user to create a new class (derived class) from an existing class (base class)
The derived class inherits all the features from the base class and can have additional features of its own.

Here we write the keyword 'Open' before the base class. By default, classes in kotlin are final. If you are familiar with java, you know that a final class cannot be subclassed. By using the open annotation on a class, compiler allows you to derive new classes from it.

For example: let be a base class be Employee having name, age, salary as a method and the webDeveloper, androidDeveloper, iosDeveloper are the inherit class with an additional features. They just need to inherit the class from the base class to get the default method of the base class.


 */

open class Employee(var name: String, var age: Int, var salary: Double){
    init {
        println("My name is $name")
        println("My age is $age")
        println("My salary is $salary")
    }


}



class WebDeveloper(name: String, age: Int, salary: Double) : Employee(name, age, salary){

    fun buildWeb(){
        println("I build the website.")
    }
}


class AndroidDeveloper(name: String, age: Int, salary: Double) : Employee(name, age, salary){
    fun buildAnd(){
        println("I build the android applications.")
    }
}

class IosDeveloper(name: String, age: Int, salary: Double) : Employee(name, age, salary){
    fun buildIos(){
        println("I build the Ios applications.")
    }
}

fun main(){
    val w1 = WebDeveloper("Utsaha Joshi", age = 33, salary = 3500.00)
    w1.buildWeb()

    println()
    val a1 = AndroidDeveloper(name = "Aditya Joshi", age = 29, salary = 3200.00)
    a1.buildAnd()
}




