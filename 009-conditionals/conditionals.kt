fun main() {

    val l = listOf<Int>(1,2,3,4)
    val animal = "cat"
    val num = 2

    // logic
    println(2 in l)
    println(2 == 2)
    println(2 != 2)
    println(2 > 2)
    println(2 < 2)
    println(true && true)
    println(true || false)
    println(!true)
    


    // if - else if - else
    if (true) {
        println("true")
    } else if (false) {
        println("false")
    } else {
        println("else")
    }


    // short hand
    if (10 % 2 == 0) val = "even" else val = "odd"


    // when
    when (animal) {
        "cat" -> println("meow")
        "dog" -> println("woof")
        else -> println("unknown animal")
    }

    when (num) {
        1,2,3 -> println("1,2,3")
        in 4..10 -> println("4..10")
        else -> println("else")
    }

    when (val len = animal.length) {
        1 -> println("1")
        2 -> println("2")
        else -> println("else")
    }

    when (animal) {
        is !String -> println("String")
        else -> println("else")
    }
}