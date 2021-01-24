package chap02

fun main(args: Array<String>) {
    // * 기본 자료형의 형변환
    /** 코틀린의 자료형은 기본적으로 **레퍼런스 자료형**이다.
     * 자바에서 레퍼런스 자료형은 클래스화 되어있고, 작명도 카멜케이스에 따라 첫 글자가 대문자였다.
     * 코트린에서 자료형의 첫 글자가 대문자인 것에서도 기본 자료형이 래퍼런스 타입이라는 것을 유추할 수 있다.
     * 그래서 기본 자료형으로 선언했을 경우에도 **메서드**를 사용할 수 있다.
     * 그래서인지 기본 자료형끼리의 형변환은 아래와 같이 변경할 수 있다
     **/
    val intNum: Int = 10
    val longNum: Long = intNum.toLong()
    val shortNum: Short = intNum.toShort()
}
