package `interface`

fun main(args: Array<String>) {
    val obj = SingleInterfaceImp()
    println("My Variable Value is = ${obj.myVar}")
    print("Calling hello(): ")
    obj.hello()

    print("Message from the Website-- ")
    println(obj.absMethod())
}

interface ExampleInterface {
    var myVar: Int              // abstract property
    fun absMethod(): String     // abstract method

    fun hello() {               // method with default implementation
        println("Hello there, this is a method with default implementation!")
    }
}

class SingleInterfaceImp : ExampleInterface {
    override var myVar: Int = 25
    override fun absMethod() = "Happy Learning"

    /*override fun hello() {               // method with default implementation
        println("Hello there, overriding default implementation!")
    }*/
}
