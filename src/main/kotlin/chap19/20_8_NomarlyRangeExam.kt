package chap19

/**
 * 보통은 이런 예제처럼 표현하지 않고, 아래의 코드처럼 코틀린에서 지원하는 Range 문법을 사용한다.
 * 시작..끝 의 문법으로 표현한다.
 */
fun main() {
    val intRange = 0..10
    val charRange = 'a'..'e'

    for (i in intRange) {
        println(i)
    }

    for (c in charRange) {
        println(c)
    }

    for (i in 0..4) {
        println(i)
    }
}
