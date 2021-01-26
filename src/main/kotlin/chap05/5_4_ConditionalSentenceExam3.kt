package chap05

fun main() {
    /**
     * 마지막으로 when문은 그 자체로 함수가 될 수도 있다. 보통 무언가를 식별할 때 if로 검사하고 조건이 맞을 경우
     * 해당 값을 리턴하는 경우가 많은데 when으로 이 함수를 더욱 간략하게 선언할 수 있다.
     *
     * 아래의 코드는 숫자로 자릿수를 찾아내는 함수를 when을 사용해 선언했다. 0 ~ 9 사이의 수는 한 자리 수, 10~99 사이의 수는
     * 두 자리 수의 조건을 주어 문자열을 리턴하게 했다. 기존 if-return이 반복되는 함수구조보다 직관적이고 깔끔해진 것을 볼 수 있다.
     */

    val num: Int = 50
    val digitStr = digit(num)

    println(digitStr)
}

private fun digit(num: Int) = when (num) {
    in 0..9 -> {
        "한 자리 수"
    }
    in 10..99 -> {
        "두 자리 수"
    }
    in 100..999 -> {
        "세 자리 수"
    }
    else -> "Out of range"
}

