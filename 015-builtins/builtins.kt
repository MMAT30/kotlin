fun main() {

    // takeIf
    val num = 10
    val something: Int? = num.takeIf { it > 5 }
    println(something)


    // takeUnless
    val somethingElse: Int? = num.takeUnless { it > 5 }
    println(somethingElse)


    // let
    val dog = Dog()
    dog.let { obj ->
        obj.speak()
        println(obj)
    }


    // with
    with(dog) {
        name = "Spot"
        speak()

    }

    // run
    dog.run {
        name = "Spot"
        speak()
    }

    // run alternative
    run {
        val stray = Dog()
        stray.name = "Spot"
        stray.speak()
    }

    // apply
    dog.apply {
        name = "Spot"
    }.speak()


    // also
    dog.apply {
        name = "Spot"
    }.also { 
        it.speak()
    }
    
}

class Dog {

    var name: String? = null

    fun speak() {
        println("woof $name")
    }
}