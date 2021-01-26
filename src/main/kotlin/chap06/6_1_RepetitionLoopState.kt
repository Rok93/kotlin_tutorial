package chap06

fun main() {
    /**
     * 코틀린의 for문은 기본적으로 for-each문이다. 자바처럼 숫자로 조건식, 증감식을 사용하는 것이 아니라,
     * 데이터의 묶음에서 요소를 하나씩 가져와 사용하는 구조이다.
     *
     * 기본적인 for문 사용법은 아래의 코드와 같다. 이 출력 결과는 배열 arr에서 순서대로 요소를 꺼내와 출력하므로 "A"부터 "E"까지 출력하게 된다.
     */

    val arr = arrayOf("A", "B", "C", "D", "E")

    for (item in arr) {
        println(item)
    }
}
