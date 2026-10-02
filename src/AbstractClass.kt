/* An abstract classs is a class that is only meant to be inherited from.
* we cannot create an object of it directly.
* It acts as template that says:"every child must provide these functions."
* Why to use Abstract Class :-  An abstract class is useful when several classes share common code but also each need to do one part in their own way. It lets you write the shared part once and force every child to fill in the rest.
* */


abstract  class Employee(var name: String, var age: Int, var salary: Float){
    fun printDetails(){
        println("My name is $name")
        println("My age is $age")
        println("My salary is $salary")
    }

    abstract fun work()

    open fun code(){
        println("Code Randomly.")
    }
}


class WebDeveloper(name: String, age: Int, salary: Float, var language: String): Employee(name, age, salary){
    override fun work() {
        println("This is an abstract class functions")
    }

    override fun code() {
        println("Statically typed coding.")
    }

}


fun main(){
    val w1 = WebDeveloper("Adiyta", age = 29, salary = 3600.00f, language = "javascript")
    w1.printDetails()
    w1.work()
    w1.code()
}