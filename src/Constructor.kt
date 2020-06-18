fun main(args: Array<String>) {

    //  Primary constructor
    val person1 = Person("Alex", 29)
    println("First Name = ${person1.firstName}")
    println("Age = " + person1.age)

    //  Secondary constructor
    println()
    val person2 = Person("Alex", 29, "Welcome to the example of Secondary  constructor, ")
    print(
        "${person2.message}" + "${person2.firstName}. " + "Your Age is- ${person2.age}"
    )
}


class Person(val firstName: String, var age: Int) {
    var message = ""

    constructor(name: String, age: Int, message: String) : this(name, age) {
        this.message = message
    }
}