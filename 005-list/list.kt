fun main() {

    // lists are immutable by default
    // list of diffrent types
    val colors1 = listOf("blue", "green", "red", "yellow")
    println(colors1)

    // adding a new element to the list is not allowed since the list is immutable
    // colors1.add("purple") // ERROR

    // list of same type
    val colors2 = listOf<String>("blue", "green", "red", "yellow")
    println(colors2)





    // array list are mutable
    var colors3 = arrayListOf<String>("blue", "green", "red", "yellow")
    println(colors3)

    // adding a new element to the list is allowed since the list is mutable
    colors3.add("purple")
    println(colors3)

    // removing an element from the list
    colors3.remove("red")
    println(colors3)

}