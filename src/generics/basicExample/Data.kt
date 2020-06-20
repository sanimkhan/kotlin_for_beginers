package generics

data class Dog(val id: Int, val name: String)
data class Cat(val id: Int, val name: String)

class Cage<T>(var animal: T, val size: Double) {
    fun display() {
        val animal = animal
        if (animal is Dog) {    //  automatically cast to Dog
            println("Its Dog- " + animal.id + ", " + animal.name)
        } else if (animal is Cat) {
            println("Its Cat- " + animal.id + ", " + animal.name)
        } else if (animal is String) {
            println("Its string- " + animal)
        }
    }
}
