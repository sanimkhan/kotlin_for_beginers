package sealedClass

fun main(args: Array<String>) {
    val r = ColorSealed.Red()
    eval(r)
}

sealed class ColorSealed{
    class Red : ColorSealed()
    class Orange : ColorSealed()
    class Blue : ColorSealed()
}

fun eval(c: ColorSealed) =
    when (c) {
        is ColorSealed.Red -> println("Paint in Red Color")
        is ColorSealed.Orange -> println("Paint in Orange Color")
        is ColorSealed.Blue -> println("Paint in Blue Color")
    }
