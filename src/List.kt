/*
 List store items in the order that they are added, and allow for duplicate items.

 To create a read-only  list , use the listof() function

 To create a mutable list MutableList, use the mutableListof() function

*/

fun main(){
    // Read only list
    val readOnlyShapes = listOf("triangle","square","circle")
    println(readOnlyShapes)
    println("The first item of the list is : ${readOnlyShapes[0]}")


    //mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("rectangle","square","circle")
    println(shapes)
    println("The last item of the MutableList is ${shapes[2]}")
    ///or
    println()
    println("The first item is ${shapes.first()}")
    println("The last item of the list is : ${shapes.last()}")
}



