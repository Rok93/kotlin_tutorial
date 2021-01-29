package chap16

/**
 * NullCheck를 하여 null이 아닐 경우 수행할 연산을 코드블럭으로 정의하여 실행시킬 수도 있다.
 * 모든 클래스에있는 let 이라는 메서드가 있는데 이 메서드는 자기 자신을 람다의 인자로 넘겨 수행할 코드블럭을 정의할 수 있다.
 * 이 메서드는 코틀린 클래스의 객체뿐만 아니라 기존의 자바 클래스의 객체에서도 사용이 가능하다.
 *
 * 아래의 코드를 보자. number1과 number2의 객체에서 let이라는 메서드를 호출했고, 람다로 null이 아닐 경우에 수행할 행동들을 정의했다.
 *
 * 코드블럭 안에서 "it"는 이전에 람다에서 본 것처럼 인자가 1개일 경우 인자를 명시하는 것을 생략하고, 그 인자를 부를 이름을 정한 약속어이다.
 * 즉 number1의 코드블록 안에서 it는 number1을 가르킨다.
 */
fun main() {
    val number1: Int? = 0
    val number2: Int? = null

    number1?.let {
        println("number1은 null이 아닙니다")
        println(it.toString())
    }

    number2?.let {
        println("number2는 null이 아닙니다.")
        println(it.toString())
    }
}
