open class ABC {
    fun think() {
        println("Hey!! i am thinking")
    }

    open fun write () {
        println("Hey!! I am parent method")
    }
}

class BCD : ABC() { // inheritance happened using default constructor
    override fun write () {
        println("Hey!! i am writing ")
    }
}

fun main(args: Array<String>) {
    var a = BCD()
    a.think()
    a.write()
}