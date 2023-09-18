fun main() {

    // sets are unqiue and unordered and immutable by default
    // set of diffrent types
    val colors1 = setOf("blue", "green", "red", "yellow", "blue", 1, 2, true, false)
    println(colors1)

    // adding a new element to the set is not allowed since the set is immutable
    // colors1.add("purple") // ERROR

    // set of same type
    val colors2 = setOf<String>("blue", "green", "red", "yellow", "blue", "green")
    println(colors2)





    // hash set are mutable
    var colors3 = hashSetOf("blue", "green", "red", "yellow", "blue", 1, 2, true, false)
    println(colors3)


    // adding a new element to the set is allowed since the set is mutable
    colors3.add("purple")
    println(colors3)


    // removing an element from the set
    colors3.remove("red")

    // hash set are unordered
    var colors4 = hashSetOf<String>("blue", "green", "red", "yellow", "blue", "green")
    println(colors4)
}