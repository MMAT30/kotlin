fun main() {

    val p1 = P2()
    p1.sayHello()

    val p4 = Person("someone", 12)
    p4.sayHello()
}

abstract class P0 {
    abstract fun sayHello()
}


class P1 (val name: String, val age: Int): P0() {

    // works like a constructor
    init {
        println("Hello from P1")

    }

    override fun sayHello() {
        println("Hello, my name is $name")
    }
}

// secondary constructor
class P2 {

    var name: String = ""
    var age: Int = 0

    // constructor overloading
    constructor(name: String, age: Int) {
        println("Hello, my name is $name, my age is $age")
        this.name = name
        this.age = age
    }

    constructor(name: String) {
        println("Hello, my name is $name")
        this.name = name
    }

    constructor(age: Int) {
        println("Hello, my age is $age")
        this.age = age
    }

    constructor() {
        println("Hello, I am a person")
    }

    fun sayHello() {
        println("Hello from P2")
    }
}


open class P3 (val name: String, val age: Int) {
    open internal var message = "Hello from P3"

    // works like a constructor
    init {
        println("Hello from P3")
    }

    open fun sayHello() {
        println("test $message")
    }
}


class Person: P3 {

    override internal var message = "Hello from Person"

    constructor(name: String, age: Int): super(name, age) {
        println("Hello, my name is $name, my age is $age")
    }

    override fun sayHello() {
        println("Hello, I'm a Person")
        super.sayHello()
    }
}

// sealed class
sealed class P4: P0() {
    override fun sayHello() {
        println("Hello from P4")
    }
}

// enum class
enum class Color {
    RED, GREEN, BLUE
}


// data class
data class Stuff (
    var name: String = ""
    var age: Int = 0
)