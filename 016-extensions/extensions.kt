
val String.isHello: Boolean  get() = this == "Hello"
fun main() {

    val str: String = "Hello"


    // creating a slim funtion attached or exteded to the class String
    fun String.slim() = this.substring(1, this.length - 1)
    println(str.slim())



    // exteding properties of a class
    println(str.isHello)

}