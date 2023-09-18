fun main() {

    // maps are unqiue and unordered and immutable by default
    // map of diffrent types
    // alternative form - mapOf(Pair("blue", 1), Pair("green", 2), Pair("red", 3), Pair("yellow", 4))
    val colors1 = mapOf("blue" to 1, "green" to 2, "red" to 3, "yellow" to 4)
    println(colors1)

    // adding a new element to the map is not allowed since the map is immutable
    // colors1["purple"] = 5 // ERROR

    // map of same type
    val colors2 = mapOf<String, Int>("blue" to 1, "green" to 2, "red" to 3, "yellow" to 4)
    println(colors2)




    // hash map are mutable
    var colors3 = hashMapOf("blue" to 1, "green" to 2, "red" to 3, "yellow" to 4)
    println(colors3)


    // adding a new element to the map is allowed since the map is mutable
    colors3["purple"] = 5
    println(colors3)


    // removing an element from the map
    colors3.remove("red")


    // hash map are unordered
    var colors4 = hashMapOf<String, Int>("blue" to 1, "green" to 2, "red" to 3, "yellow" to 4)
    println(colors4)
}