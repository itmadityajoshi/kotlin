/*
* Maps store items as key-value pairs. You can access the value by referencing the key.
* You can imagine a map like a  food menu.
* You can find the price(value), by finding the food (key) you want to eat.
* Maps are useful if you want to look up a value without using a numbered index, like in a list.
*
* */

// To create a read-only map, use the mapOf function
// To create a mutable map (MutableMap), use the mutableMapOf() function.

//The easiest way to create maps is to use to between each key and its related value:

// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "Kiwi" to 190, "orange" to 100)

// Mutable map with explicit type declaration
val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "Banana Lassi" to 200, "Machata" to 300)

fun main(){
    println(readOnlyJuiceMenu)
    println()
    println(juiceMenu)
    println()



    //To access a value in a map, use the indexed access operator [] with its key:
    println("The value of apple juice is: ${juiceMenu["Machata"]}")
    println()
    //If you try to access a key-value pair with a key that doesn't exist in a map, you see a null value
    println("The value of apple juice is: ${juiceMenu["Pineapple"]}")
    println()

    //You can also use the indexed access operator [] to add items to a mutable map:
    juiceMenu["coconut"] = 150
    println(juiceMenu)
    println()

    //To remove items from a mutable map, use the .remove() function:
    juiceMenu.remove("Banana Lassi")
    println(juiceMenu)
    println()

    //To get the number of items in a map, use the .count() function:
    println("This map has ${juiceMenu.count()} key-value pairs.")
    println()

    //To check if a specific key is already included in a map, use the .containsKey() function:
    println(juiceMenu.containsKey("Kiwi"))
    println()

    //To obtain a collection of the keys or values of a map, use the keys and values properties respectively:
    println(juiceMenu.keys)
    println()
    println(juiceMenu.values)
    println()
}
