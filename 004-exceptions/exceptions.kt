import java.lang.Exception


fun main() {
    try {
        println("trying something")
        throw Exception("something went wrong")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    } finally {
        println("Finally")
    }
}