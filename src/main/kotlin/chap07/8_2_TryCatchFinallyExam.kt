package chap07

import java.lang.NumberFormatException

fun main() {
    val str = "a"
    var num: Int

    try {
        num = str.toInt()
    } catch (e: NumberFormatException) {
        println("예외 발생")
        num = 0
    } finally {
        println("finally 구문")
    }

    println("num의 값은 ${num} 입니다.")

}
