class Person(val name: String, var age: Int) {

    fun introduce() {
        println("Hi, I'm $name and I'm $age years old.")
    }
}

fun main() {
    val p1 = Person("Aditya", 25)   // no "new" keyword in Kotlin
    p1.introduce()                  // Hi, I'm Aditya and I'm 25 years old.
    p1.age = 26                     // var can change, val cannot
}