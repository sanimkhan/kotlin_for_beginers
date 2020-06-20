package generics.classHierarchy

fun main(args: Array<String>) {
    val dog = Dog(id = 0, name = "Doglin")
    val cageDog = Cage(dog, 6.0)
    cageDog.display()

    val cat = Cat(id = 1, name = "Catlin")
    val cageCat = Cage(cat, 6.0)
    cageCat.display()

    // Cage is not restricted to class hierarchy <t : Animal>. So it throws error
    /*val cageString = Cage("String Animal", 6.0)
    cageString.display()*/
}
