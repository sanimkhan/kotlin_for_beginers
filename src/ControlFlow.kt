fun main(args: Array<String>) {

    println("if else")
    ifElse()

    println()
    println()
    println("when")
    `when`()


    println()
    println()
    println("For loop")
    forLoop()

    println()
    println()
    println("For loop 2")
    forLoop2()

    println()
    println()
    println("While")
    whileLoop()


    println()
    println()
    println("Do while")
    doWhileLoop()

    println()
    println()
    println("Break and Continue")

    brerakAndContinue()

}

private fun ifElse() {
    var a = 5
    var b = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    print("Maximum of a or b is " + max)
}

private fun `when`() {
    var x = 6
    when (x) {
        1 -> print("x is 1")
        2 -> print("x is 2")
        3 -> print("x is 2")
        4, 5 -> print("x is 4 or 5")

        else -> { // Note the block
            print("x is out of 1-5 range")
        }
    }
}

private fun forLoop() {
    var items = listOf(1, 2, 3, 4)
    for (i in items) {
        println("values of the array " + i)
    }
}

private fun forLoop2() {
    var items = listOf(1, 2, 3, 4)
    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }
}

private fun whileLoop() {
    var x = 0
    println("Example of While Loop--")

    while (x <= 3) {
        println(x)
        x++
    }
}

private fun doWhileLoop() {
    var x = 0
    do {
        x = x + 10
        println("I am inside Do block---" + x)
    } while (x <= 30)
}

private fun brerakAndContinue() {
    myLabel@ for (x in 1..10) { //  applying the custom label
        if (x == 3) {
            println("I am inside if block with value " + x + "\n-- hence it will close the operation")
            break@myLabel //    specifying the label
        } else {
            println("I am inside else block with value " + x)
            continue@myLabel
        }
    }
}

