package chap07

import java.lang.NumberFormatException

/**
 * 또한 자바와 다른 점은 try-catch를 표현식처럼 사용할 수 있다. 즉 try-catch로 리턴값을 전달할 수 있으며,
 * 그 값을 별도의 변수나 상수에 할당할 수 있다.
 *
 * 아래의 코드를 보면 표현식처럼 사용할 수 있는 것을 확인할 수 있다. "10A"는 숫자로 변환이 불가능하므로
 * NumberFormatException을 내뿜게 된다. 그리하여 출력문으로 "예외 발생"을 출력하고 마지막 줄에 있는
 * 0을 리턴하여
 *
 * 그래서 number의 값에는 0이 들어가게 된다. 만약 try안의 문자열이 "10A"가 아닌 "10"이였다면 10 이 정수로
 * 변환되어 number에 들어갔을 것이다.
 */
fun main() {
    val number = try {
        "10A".toInt()
    } catch (e: NumberFormatException) {
        println("예외 발생")
        0
    }

    println("number의 값은 ${number} 입니다.")
}
