open class ABC {
    fun think() {
        println("Hey!! i am thiking ")
    }

    open fun write () {
    }
}

class BCD : ABC() { // inheritence happend using default constructor
    override fun write () {
        println("Hey!! i am writing ")
    }
}

fun main(args: Array<String>) {
    var a = BCD()
    a.think()
    a.write()
}