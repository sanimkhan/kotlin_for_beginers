package DataTypes

fun main(args: Array<String>) {

    println("Numbers")
    number()

    println()
    println()
    println("Character and String")
    charAndString()

    println()
    println()
    println("Boolean")
    boolean()

    println()
    println()
    println("Array")
    array()
}

private fun number() {
    var int = 10000
    var double = 100.00
    var float = 100.00f
    var long = 1000000004
    var short = 10
    var byte = 1

    println("Your Int Value is- " + int)
    println("Your Double  Value is- " + double)
    println("Your Float Value is- " + float)
    println("Your Long Value is- " + long)
    println("Your Short Value is- " + short)
    println("Your Byte Value is- " + byte)
}

private fun charAndString() {
    var char = 't'
    var string = "Test string"

    println("Your Char Value is- " + char)
    println("Your String Value is- " + string)
}

private fun boolean() {
    var boolean = true
    println("Your Boolean Value is- " + boolean)
}

private fun array() {
    var arrayInt1 = arrayOf(1, 10, 3)
    var arrayInt2 = arrayOf<Int>(1, 10, 3)
    var arrayString = arrayOf<String>("Test", "String")

    println("Your array 1 Value is- " + arrayInt1.contentToString())
    println("Your array 2 Value is- " + arrayInt2.contentToString())
    println("Your array 3 Value is- " + arrayString.contentToString())
}
