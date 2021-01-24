package chap02

fun main(args: Array<String>) {
    // 타입 검사
    /**
     * 자료형 혹은 객체의 타입을 확인하기 위해서는 **is** 키워드를 사용한다. 자바에서는 instanceof 키워드를 사용하지만 is가 더 직관적이다.
     */
    val str: Any = "문자열"

    if (str is String) {
        println("str은 문자열입니다")
    } else if (str is Int) {
        println("str은 정수입니다.")
    } else {
        println("str은 무슨 타입인지 모르겠습니다.")
    }
}
