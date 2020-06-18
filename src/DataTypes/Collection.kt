package DataTypes

fun main(args: Array<String>) {
    //  intro
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


    // collection methods
    println()
    var items = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("First Element of our list----" + items.first())
    println("Last Element of our list----" + items.last())
    println("Even Numbers of our List----" + items.filter { i -> i % 2 == 0  })

    var hashMap = hashMapOf("foo" to 1, "bar" to 1)
    println("Hashmap--- " + hashMap["foo"])
}
