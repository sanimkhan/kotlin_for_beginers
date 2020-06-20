import java.lang.Exception

fun main(args: Array<String>) {
    val myVar: Int = 12;
    val v: String = "Kotlin tutorial";

    try {
        v.toInt();
    } catch (e: Exception) {
        e.printStackTrace();
    } finally {
        println("Exception Handeling in Kotlin");
    }
}
