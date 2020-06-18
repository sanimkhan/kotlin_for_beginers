package ClassAndObject


fun main(args: Array<String>) {
    val obj = myClass() // create obj object of myClass class
    obj.printMe()
}

class myClass {

    // property (data member)
    private var name: String = "Class and Object"

    // member function
    fun printMe() {
        print("We are learning- " + name)
    }
}