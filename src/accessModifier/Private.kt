package accessModifier

fun main(args: Array<String>) {
    var obj = PrivateExample()

    //println(obj.i)  //  can not access
}


private class PrivateExample {
    private val i = 1
}