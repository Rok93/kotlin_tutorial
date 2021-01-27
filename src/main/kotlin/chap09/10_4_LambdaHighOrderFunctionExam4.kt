package chap09

/**
 * 람다를 처음 설명할 때에 매개변수가 없거나, 혹은 1개이면 중괄호와 화살표 "()->"를 생략할 수 있다고 했엇다.
 * 매개변수가 없는 것은 그렇다 치지만 매개변수가 1개일 때에는 어떻게 변수명을 처리할 수 있을까?
 * 코틀린에서는 이 단일 매개변수의 이름을 "it"로 부르기로 약속했다. 람다를 사용하는 방법은 매개변수가 없을 때와 동일하지만
 * 그 변수를 사용하고 싶다면 "it"를 사용하면 된다.
 *
 * 아래의 코드는 단순하게 숫자를 받아 String()으로 변환해주는 함수를 전달하여 사용하는 코드이다. invokeFunction5를 먼저 보면
 * 매개변수로 정수 1개를 인자로 받아 문자열을 리턴하는 형식의 함수를 받겠다고 선언했다.
 */
fun main() {
    invokeFunction5 {
        println("단일매개변수 it의 값 $it")
        it.toString()
    }

}

fun invokeFunction5(f: (Int) -> String) {
    val returnValue = f(10)
    println(returnValue.length)
}
