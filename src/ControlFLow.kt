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

//Here is an example of using when as an expression. The when expression is assigned immediately to a variable which is later used with the println() function:
    val obj = "Hello"

    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "grut Dich!"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)

    val trafficLightState = "Red"

    val trafficAction = when{
        trafficLightState == "Green" -> "Go"
        trafficLightState == "yellow" -> "Slow Down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction)
}