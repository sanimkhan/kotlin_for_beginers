package classAndObject

fun main(args: Array<String>) {
    Outer.Nested().foo()

    println()
    Outer().Inner().foo()
}

//  outer class for nested class example
class Outer {
    private var bar = 1

    class Nested {
        fun foo(){
            //  println(bar)    //  nested class can not access outer class member
            println("Print form nested class")
        }
    }

    inner class Inner {
        fun foo() {
            println("Print form inner class- " + bar)
        }
    }
}
