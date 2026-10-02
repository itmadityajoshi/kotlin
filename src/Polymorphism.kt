/*


open class Employee(var name: String, var age: Int, var salary: Float){
    fun details() {
        println("My name is $name")
        println("My age is $age")
        println("My salary is $salary")
    }

    open fun work(){
        println("I do general work too.")
    }
}

class WebDeveloper(name: String, age: Int, salary: Float, var language: String): Employee(name,age, salary){
    fun buildWeb(){
        println("I build the website.")
    }

    override fun work() {
        println("I build website using $language.")
    }
}

class AndroidDeveloper( name: String, age: Int, salary: Float, var language: String): Employee(name, age, salary){
    fun buildAnd(){
        println("I build an Android Applications.")
    }

    override fun work() {
        println("I build android app using $language.")
    }
}

class IosDeveloper(name: String, age: Int, salary: Float, var language: String): Employee(name, age, salary){

//    init {
//        println("I used $language to build ios applications.")
//    }
    fun buildIos(){
        println("I build an Ios Applications.")
    }

    override fun work() {
        println("I build ios apps using $language")
    }
}


fun main(){
//    val w1 = WebDeveloper("Lada", age = 22, salary = 3600.00f, language = "javascript")
//    w1.buildWeb()
//    w1.work()
//
//    println()
//
//    val i1 = IosDeveloper(name = "Razzev", age = 32, salary = 3800.00f, language = "Swift")
//    i1.buildIos()

    val team: List  <Employee> = listOf(
        WebDeveloper("Lada", age = 22, salary = 3600.00f, language = "javascript"),
        AndroidDeveloper(name = "Aditya", age = 29, salary = 3400.00f, language = "kotlin"),
        IosDeveloper(name = "Razzev", age = 32, salary = 3800.00f, language = "Swift"),
    )

    for (e in team) {
        e.details()
        e.work()
        println()
    }

}*/
