package dataClass

fun main(args: Array<String>) {
    val book: Book = Book("Kotlin", "TestPublisher", 5)
    println("Name of the DataClass.Book is--"+book.name) // "Kotlin"
    println("Puclisher Name--"+book.publisher) // "TutorialPoint.com"
    println("Review of the book is--"+book.reviewScore) // 5
    book.reviewScore = 7
    println("Printing all the info all together--"+book.toString())
    //using inbuilt function of the data class

    println("Example of the hashCode function--"+book.hashCode())
}
