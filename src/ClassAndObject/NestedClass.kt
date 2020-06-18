package ClassAndObject

fun main(args: Array<String>) {
    Outer.Nested().foo() // calling nested class method
}

class Outer {
    class Nested {
        fun foo() {
            println("This is example of nexted Class")
        }
    }
}
