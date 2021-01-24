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

    // 문자열의 숫자 변환
    /**
     * 자바에서는 문자열을 숫자로 변환할 때 각 자료형별로 parse 메서드를 사용해야했다.
     * 이 또한 너무 소스의 길이가 길었고 불편했기에 개선의 여지가 있었다.
     *
     * 코틀린에서는 이를 위에 나온 형 변환 메서드로 매우 간략하게 줄여버렸다.
     * 하지만 숫자가 아닌 문자열을 형 변환할 순 없다. 자바와 똑같이 잘못된 문자열을 형 변환한다면 NumberFormatException 이 발생한다.
     * NumberFormatException은 RuntimeException을 상속받기 때문에 명시적인 예외처리를 해주지 않아도 되지만, 문자열의 형태가 숫자임이 보장되지 않는
     * 이상 명시적인 예외처리를 해주어야 한다.
     */
    val str = "10"
    val number: Int =
        try {
            str.toInt()
        } catch (e: Exception) {
            0
        }
    // 만약 str이 숫자로 변환될 수 없는 문자열이 있었다면 number에는 0이 들어가서 0이 출력되었을 것이다.
    println(number)
}
