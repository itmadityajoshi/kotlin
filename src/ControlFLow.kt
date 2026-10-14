/*
* When
* Use "when" when you have a conditional expression with multiple branches.
*
* To use when:
* place the value you want to evaluate within parentheses()
* place the branches within curly braces {}
* use -> in each branch to separate each check from the action to take if the check is successful.
*
* */

var nam = "Hello"

fun main(){
    when(nam) {
        //check whether obj equals to "1"
        "1" -> println("One")
        //check whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        //default statement
        else-> println("unknown")
    }
}