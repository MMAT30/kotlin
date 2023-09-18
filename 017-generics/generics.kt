fun main() {

    val printer = Printer<String>()
    printer.printArray("one", "two", "three")


}

class Printer<T> {
    fun printArray(vararg stuff: T) {
        for (element in stuff) {
            println(element)
        }
    }
}