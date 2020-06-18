package DataTypes

fun main(args: Array<String>) {

    println("Collection Inrto")
    collectionIntro()

    println()
    println()
    println("Collection methods")
    collectionMethods()


    println()
    println()
    println("Range")
    range()
}

private fun collectionIntro() {
    var numbers = mutableListOf(1, 2, 3) //mutable List
    var readOnlyView: List<Int> = numbers                  // immutable list
    println("Mutable list--" + numbers)        // prints "[1, 2, 3]"

    numbers.add(4)
    println("Mutable list after addition --" + numbers)        // prints "[1, 2, 3, 4]"
    numbers.add(5)
    println("Immutable list after addition --" + readOnlyView)

    numbers.clear()
    println("Mutable list after clear --" + numbers)        // prints "[1, 2, 3, 4]"
    //readOnlyView.clear()
    //println("Immutable list after clear --" + readOnlyView)
}

private fun collectionMethods() {
    var items = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("First Element of our list----" + items.first())
    println("Last Element of our list----" + items.last())
    println("Even Numbers of our List----" + items.filter { i -> i % 2 == 0 })

    var hashMap = hashMapOf("foo" to 1, "bar" to 1)
    println("Hashmap--- " + hashMap["foo"])
}

private fun range() {
    val i = 2

    for (j in 1..4) {
        print("In j loop- ")
        println(j) // prints "1234"
    }

    if (i in 1..10) { // equivalent of 1 < = i && i < = 10
        println("we found your number --" + i)
    }
}

