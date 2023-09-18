

import kotlin.io.println

fun main() {
    println(adder(1, 1))
    println(adder(listOf(1, 2, 3, 4, 5)))
    println(adder(1, 2, 3, 4, 5))
    println(lambda(1, 2))
    println(radius(2))
    println(higherOrder(1, 2, lambda))
}



// function overloading
fun adder(a: Int, b: Int): Int {
    return a + b
}

fun adder(vararg nums: Int): Int {
    var sum = 0
    for (x in nums) {
        sum += x
    }
    return sum
}

fun adder(stuff : Collection<Int>): Int {
    var sum = 0
    for (x in stuff) {
        sum += x
    }
    return sum
}

// short hand
fun radius(radius: Int) =  3.145 * radius * radius


// lambda functions
val lambda = { a: Int, b: Int -> a + b }

// higher order functions
fun higherOrder(a: Int, b: Int, func: (Int, Int) -> Int): Int {
    return func(a, b)
}