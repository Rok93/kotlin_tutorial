package chap16

/**
 * 이 "?:" 연산자를 이용해서 여러 가지 작업을 수행할 수 있다. 이전에 본 값이 null이 아닐 때에 연산하는 let 구문이 있는 반면
 * 값이 null일 때에 수행하는 let 구문을 정의할 수도 있다.
 *
 * 아래의 코드의 NullCheckExam 클래스에서 nullCheck 메서드 안을 보자. 멤버 변수 str1이 null이라면 let구문으로 수행할 구문들을 정의한다.
 * 또한 지역변수 str2도 null인지 체크해서 let으로 출력구문을 정의했다. nullCheck를 호출하면 str1은 null값이 맞으므로 "str1은 null입니다."가
 * 출력되고, str2는 null이 아니므로 let 구문이 실행되지 않아 출력이 되지 않는다.
 *
 */
fun main() {
    val nullChecker = NullCheckExam()
    nullChecker.checkNull()
}

class NullCheckExam {
    var str1: String? = null

    fun checkNull() {
        var str2: String? = "ABCD"

        str1 ?: let {
            println("str1은 null 입니다.")
        }

        str2 ?: let {
            println("str2는 null 입니다.")
        }
    }
}
