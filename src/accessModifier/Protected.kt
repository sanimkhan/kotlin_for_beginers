package accessModifier

fun main(args: Array<String>) {

    var objA = A()
    //println(objA.i) //  cant access

    var obj = ProtectedExample()
    println(obj.getValue())

}


open class A() {
    protected val i = 1
}

class ProtectedExample : A() {
    fun getValue(): Int {
        return i
    }
}
