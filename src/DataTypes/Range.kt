package DataTypes

fun main(args: Array<String>) {
    val i = 2

    for (j in 1..4) {
        print("In j loop- ")
        println(j) // prints "1234"
    }

    if (i in 1..10) { // equivalent of 1 < = i && i < = 10
        println("we found your number --" + i)
    }
}
