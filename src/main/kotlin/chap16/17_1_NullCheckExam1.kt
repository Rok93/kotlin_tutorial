package chap16

/**
 * Null Check
 * 코틀린의 목표 중 하나는 NullPointerException에서 안전해지는 것이다.
 * 그래서 타입부터 크게 Null을 있다, 없다로 나누어두었다. 그래서인지 기본자료형들도 무조건 레퍼런스 타입으로 만들어두었다.
 *
 * 사용법은 매우 간단하다. 타입이름의 뒤에 물음표(?)를 붙이면 Null을 가질 수 있는 타입이다.
 * 아래 예제의 number1은 Null값을 가질 수 없다. 만약 Null을 주게 되면 컴파일 에러가 발생한다.
 * 그리고 number2는 타입에 물음표가 붙어있기 때문에 Null 값을 가질 수 있다.
 *
 * 똰 물음표를 이용해 메서드의 실행여부를 결정할 수도 있다. 만약 Null값이 허용되는 타입이라면 변수명 뒤에 물음표를 달아 변수가 Null이라면
 * 메서드를 실행하지 않도록 할 수 있다.
 *
 * 아래의 코드에서 toString() 메서드를 호출하면 number2에는 Null 값이 들어있기 때문에 NPE가 발생할 것이다.
 *
 * 하지만 두번째 코드는 NPE가 발생하지 않는다. number2에 물음표를 붙여줬기 때문이다. 이처럼 물음표를 붙여주면 number2가 null값인지 검사하여
 * null이면 메서드를 실행하지 않고 null을 리턴한다.
 */
fun main() {
    val number1: Int = 0 // Not null
    val number2: Int? = null // null OK

    number2.toString() // 의외로 둘다 이상이 없다...
    number2?.toString()
}
