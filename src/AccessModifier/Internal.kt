package AccessModifier

fun main(args: Array<String>) {
    var obj = InternalExample()
    println(obj.i)  //  if his is tried from outside of this package, can not be accessed
}


class InternalExample {
    internal val i = 10
    internal fun doSomething() {
    }
}
