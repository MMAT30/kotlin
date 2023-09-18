
fun main() {

    Connection.connect()
    Connection.disconnect()
}

// works like a static class in Java for use as a singleton class
object Connection {
    var connection = false

    fun connect() {
        connection = true
        println("connection: $connection")
    }

    fun disconnect() {
        connection = false
        println("connection: $connection")
    }
}