package generics.variance

fun main(args: Array<String>) {
    var objet1 = ContraVarianceExample<Int>(10)
    var object2 = ContraVarianceExample<Double>(10.00)
    println(objet1)
    println(object2)
}

class ContraVarianceExample<in T>(input: T) {
    init {
        println("I am getting called with the value " + input)
    }
}
