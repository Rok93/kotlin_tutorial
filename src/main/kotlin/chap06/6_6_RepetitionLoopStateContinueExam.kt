package chap06

fun main() {
    val arr = arrayOf("A", "B", "C", "D", "E")

    for (i in arr) {
        println(i)
        if (i == "C")
            break
    }
}
