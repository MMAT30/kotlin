fun main(args: Array<String>) {
    for (x in args) {
        println(x)
    }

    println("enter something:")
    val input = readLine()
    println("you entered: ${input}")
}