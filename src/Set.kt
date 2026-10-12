/* set are ordered and allow duplicate items, sets are unordered and only store unique items.
*  To create a read-only set, use the setof() function
* To create a mutable set, use the mutableSetof() function
*
* when creating sets, Kotlin can infer the type of items stored. To declare the type explicitly, add the type within angled brackets <> after the set declaration.
* */


//Read-only set

val readOnlyFruit = setOf("apple","banana","cherry","cherry")

//mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple","banana","orange","orange")


fun  main(){
    println(readOnlyFruit)

    println(fruit)

    //to check the item in the set
    println("orange" in fruit)
}

/*You can see in the previous example that because sets only contain unique elements, the duplicate "cherry" and "orange" item is dropped.*/