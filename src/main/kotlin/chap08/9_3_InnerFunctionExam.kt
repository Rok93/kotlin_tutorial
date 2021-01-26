package chap08

/**
 * 내부함수
 * 코틀린의 함수에는 함수 내부에 또 함수를 정의할 수 있다. 함수의 호출범위는 내부로 제한된다.
 * 아래의 코드를 보면 좀 복잡해 보일 수도 있지만, function1 내부에 function2, function2 내부에 function3이 선언되어 있다.
 * 각각 인자로 받은 숫자에 1을 더해 리턴해준다. 그래서 function1에 0을 넘겼을 때 함수가 총 3번 호출되므로 3이 리턴된다.
 */
fun main() {
    println(function1(0))
}

fun function1(num1: Int): Int {
    fun function2(num2: Int): Int {
        fun function3(num3: Int): Int {
            return num3 + 1
        }
        return function3(num2) + 1
    }
    return function2(num1) + 1
}
