package chap09

/**
 * 두 번째로 인자가 여러 개의 함수를 받는 함수를 만들어보자. 아래의 코드를 보자.
 * main 함수에서는 숫자 두개를 합해 리턴하는 함수를 정의하여 invokeFunction3 함수에 전달하였다.
 *
 * 그리고 invokeFunction3은 정수 2개를 받아 정수를 리턴하는 형식의 함수를 받겠다고 선언했다. 그리고 인자로 받은 함수에
 * 10과 20을 전달하여 호출했다. 인자로 받은 함수는 덧셈을 수행하는 함수이므로 10과 20을 합한 30이라는 값을 리턴받게 되고, 마지막에는 30이 출력된다.
 */
fun main() {
    invokeFunction3 { a, b ->
        a + b
    }
}

fun invokeFunction3(f: (Int, Int) -> Int) {
    val returnValue = f(10, 20)
    println(returnValue)
}
