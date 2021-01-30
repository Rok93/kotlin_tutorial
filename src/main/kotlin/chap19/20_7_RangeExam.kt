package chap19

/**
 * Range
 * Range는 숫자나 문자의 범위를 나타낼 때 사용한다. 이를 객체로 선언할 때에는 아래의 코드와 같다.
 * 대표적으로 Int, Char, Long의 Range가 있다.
 * 이는 특정 명시된 범위를 나타내며 코드에서 반복문으로 명시된 범위만큼의 숫자와 문자를 순서대로 출력할 수 있다.
 *
 * 예제의 실행결과는 명시된 범위의 값들이 전부 순서대로 출력된다.
 */
fun main() {
    val intRange = IntRange(0, 10)
    val charRange = CharRange('a', 'e')
    val longRange = LongRange(11, 20)

    for (i in intRange) {
        println(i)
    }

    for (c in charRange) {
        println(c)
    }

    for (l in longRange) {
        println(l)
    }
}
