fun main() {

}

interface Animal {
    val name: String
    fun speak()
    fun eat() {
        println("eat")
    }
}

class Cat : Animal {
    override val name: String = "cat"

    override fun speak() {
        println("meow")
    }

    override fun eat() {
        println("eat")
    }

}