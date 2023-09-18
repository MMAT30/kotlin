fun main() {

    val str: String? = null

    val safe: String = "safe string"

    // elvis operator - if null, return default value
    println(str?: "default value")


    // safe call operator - if null, return null
    println(str?.length)


    // does not need null
    println(safe)
}