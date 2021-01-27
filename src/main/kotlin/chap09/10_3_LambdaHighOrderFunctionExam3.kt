package chap09

/**
 * 람다표현식으로 넘기는 익명함수 방법 대신, **미리 정의된 함수를 넘길 수도 있다**
 *
 * 이전 예제의 코드를 변경해본다. 먼저 덧셈을 수행하는 sum 함수를 선언했다. 그리고 똑같은 invokeFunction
 */
fun main() {
    invokeFunction4(::sum)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun invokeFunction4(f: (Int, Int) -> Int) {
    val returnValue = f(10, 10)
    println(returnValue)
}


