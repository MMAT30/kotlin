fun main() {

    var num = 0


    // for loop
    for (i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 1 step 2) {
        println(i)
    }


    // break and continue can be used in loops
    // while loop
    while (num <= 2) {
        println("while loop")
        num++
    }


    // do while loop
    do {
        println("do while loop")
        num++
    } while (num <= 2)
    
}