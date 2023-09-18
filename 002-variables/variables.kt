fun main() {

    // var - mutable variable
    // val - immutable variable
    // const val - compile-time constant


 
    // byte - 8bits - min: -128, max: 127
    // short - 16bits - min: -32768, max: 32767
    // int - 32bits - min: -2147483648, max: 2147483647
    // long - 64bits - min: -9223372036854775808, max: 9223372036854775807
    // Ubyte - 8bits - min: 0, max: 255
    // Ushort - 16bits - min: 0, max: 65535
    // Uint - 32bits - min: 0, max: 4294967295
    // Ulong - 64bits - min: 0, max: 18446744073709551615
    // float - 32bits - min: 1.4E-45, max: 3.4028235E38
    // double - 64bits - min: 4.9E-324, max: 1.7976931348623157E308
    

    // literal constants
    // decimal - 123
    // hexadecimal - 0x0F
    // binary - 0b00001011
    // long - 123L
    // double - 123.5, 123.5e10
    // float - 123.5f, 123.5e10f


    // boolean - true, false
    // string - array of char - immutable
    // char - 16bits - min: '\u0000', max: '\uffff'

    
    val b: Byte = 1
    val s: Short = 1
    val i: Int = 1
    val l: Long = 1L

    val ub: UByte = 1u
    val us: UShort = 1u
    val ui: UInt = 1u
    val ul: ULong = 1uL

    val f: Float = 1.0f
    val d: Double = 1.0

    println("$b \n$s \n$i \n$l \n$ub \n$us \n$ui \n$ul \n$f \n$d")
    println("${b::class} \n${s::class} \n${i::class} \n${l::class} \n${ub::class} \n${us::class} \n${ui::class} \n${ul::class} \n${f::class} \n${d::class}")
  


    val bl: Boolean = true
    val x: String = "str"
    val y: String = "ing"
    val str: String = "${x}${y}"
    val ch: Char = 'a'

    println(bl)
    println(str)
    println(ch)

}