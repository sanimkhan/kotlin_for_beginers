package Interface

fun main(args: Array<String>) {
    val obj = MultiInterfaceImp()

    obj.printMe()
    obj.printMeToo()
}

interface Interface1 {
    fun printMe() {               // method with default implementation
        println("Hello there, this is from 1st interface!")
    }
}

interface Interface2 {
    fun printMeToo() {               // method with default implementation
        println("Hello there, this is from 2nd interface!")
    }
}

class MultiInterfaceImp : Interface1, Interface2 {
}
