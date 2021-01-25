package chap02

fun main(args: Array<String>) {
    /**
     * 코틀린에서 배열은 객체로 취급된다는 것은 자바와 동일하지만 선언하는 방법은 다르다.
     * 자바처럼 [] 를 사용하는 것이 아닌 **Array 클래스**에 **제네릭타입**을 넣어 표현한다.
     * main 함수에서 봐서 익숙하겠지만 String 배열은 Array<String>으로 표현한다
     *
     * 배열을 생성하는 방법은 여러 가지가 있지만 먼저 기본 값이 들어있는 배열을 생성할 때에는 arrayOf 메서드를 사용한다.
     * 아래의 사이즈 4의 정수값이 들어있는 배열을 생성하는 예제이다.
     */
    val arr: Array<Int> = arrayOf(0, 1, 2, 3)

    println(arr.contentToString()) //Arrays.toString 보다는 해당 array의 함수로 바로 값을 출력하는 것을 권장하는 것 같다!

    val intArr: IntArray = intArrayOf(1, 2, 3)
    val doubleArr: DoubleArray = doubleArrayOf(1.0, 2.0, 3.0)
    val booleanArr: BooleanArray = booleanArrayOf(true, false)
    val charArr: CharArray = charArrayOf('a', 'b', 'c')
}
