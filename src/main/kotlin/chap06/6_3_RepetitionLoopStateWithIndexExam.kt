package chap06

fun main() {
    val arr = arrayOf("A", "B", "C", "D", "E")

    for ((idx, value) in arr.withIndex()) {
        println("${idx} 번째 값은 ${value} 입니다.")
    }
}
