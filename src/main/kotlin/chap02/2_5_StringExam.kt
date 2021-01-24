package chap02

fun main(args: Array<String>) {
    /**
     * 코틀린에서는 문자열을 표현하는 방법은 기본적으로 자바와 같다. 하지만 파이썬처럼 여러 라인 문자열을 선언할 수도 있다.
     * 여러 줄로 문자열을 선언할 때 미관 등의 이유로 개행, 들여쓰기 등의 불필요한 공백이 들어갈 수 있다. 그럴 땐 예제처럼
     * ```trimMargin``` 메서드를 사용하면 이러한 문자열 위, 아래의 공백을 없앨 수 있다.
     */
    val oneLineStr = "한줄 문자열선언"

    val multiLineStr = """
        |여러 줄 문자열 선언
        |두줄
        |세줄
    """

    println(oneLineStr)
    println(multiLineStr.trimMargin())

    /**
     * 코틀린의 문자열은 기본적으로 Char의 배열처럼 취급할 수 있다. 즉 배열처럼 인덱스로 한 글자씩 접근할 수 있다.
     * 배열처럼 취급되므로 for-each문으로 한 글자씩 추출할 수도 있다.
     */

    val str = "abcdefg"

    println(str[0]) // a가 출력된다.

    for (c in str) {
        println(c) // 각 요소가 하나씩 출력된다
    }

    /**
     * 자바를 사용해본 사람이라면 문자열을 조립할 때 String에 + 연산을 하거나, StirngBuilder, StringBuffer 클래스를 사용했을 것이다.
     * 코틀린에서는 문자열 템플릿 기능을 제공하기 때문에 이런 번거로운 작업을 할 필요가 없다.
     *
     * 템플릿 문자열 안에 ``$변수명`` 혹은 ``${변수명}``으로 사용할 수 있다. {중괄호를 사용한다면 변수의 메서드까지도 호출할 수 있다}.
     * 또한 중괄호 없이 문자열 템플릿 기능을 사용할 경우 반드시 공백으로 변수를 구분해주어야한다. (이럴바에는 중괄호를 항상 쓰는게 낫지않을까?)
     */

    val myName = "박중수"
    val introduce = "제 이름은 $myName 입니다."
    val nameLength = "제 이름은 ${myName.length}글자 입니다."

    println(introduce)
    println(nameLength)
}

