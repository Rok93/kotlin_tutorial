package chap16

/**
 * 그렇다면 값이 null일 때에 수행하는 연산을 정의하려면 어떻게 해야할까 코틀린에서는 삼항연산자와 비슷하게
 * "?:" 라는 연산자를 지원한다. 이 연산자는 왼쪽에 있는 값이 null이라면 오른쪽에 정의한 값이 들어가는 연산자이다.
 *
 * 아래의 코드를 보자. num1에는 null값이 들어있고, num2에는 10이 들어있다.
 * str1에 값을 초기화해주는 곳을 보면 ?: 연산자의 왼쪽인 num1이 null이기 때문에 str1에는 "Hello!"가 들어가게 된다.
 *
 * 또한 str2에 값을 초기화하는 곳을 보면 ?: 연산자 왼쪽의 num2는 값이 있기 때문에 그대로 str2에는 "10"이 들어가게 된다.
 *
 * 마지막 출력에는 그래서 "Hello!10"이 출력된다.
 */
fun main() {
    val num1: Int? = null
    val num2: Int? = 10

    val str1 = num1?.toString() ?: "Hello!"
    val str2 = num2?.toString() ?: "Hello!"

    println("$str1 $str2")

}
