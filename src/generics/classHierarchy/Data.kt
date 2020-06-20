package generics.classHierarchy

abstract class Animal {
    abstract var id: Int
    abstract var name: String
}

data class Dog (override var id: Int, override var name: String) : Animal()
data class Cat (override var id: Int, override var name: String) : Animal()

class Cage<T : Animal>(var animal: T, val size: Double) {
    fun display() {
        println("Its Animal- " + animal.id + ", " + animal.name)
    }
}
