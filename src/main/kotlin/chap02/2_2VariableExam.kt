package chap02

fun main(args: Array<String>) {
    /*
    코틀린은 변수의 타입을 유추하여 자동으로 자료형을 부여하는 ``동적 타입캐스팅``을 지원한다.
    변수 선언은 아래와 같이 ``var`` 를 이용한다
     */
    var num1 = 1
    // num이라는 변수에는 컴파일러가 자동으로 타입을 유추하여 int라는 자료형을 부여한다.

    // 다만 명시적으로 변수형을 선언해줘야할 때가 있다.
    var num2: Int = 1

    // 변수를 미리 정의해두고, 나중에 값을 초기화해주는 것도 가능하다. 다만 이는 변수의 자료형을 명시해줬을 때에만 가능하다.
    var num4: Int
    num4 = 14

    // var num3 (하지만, 이렇게 자료형을 명시해주지 않고 초기화를 미룬다면 컴파일 에러가 발생한다
//    var num5
//    num5 = 10

    // 상수를 선언할 때에는 ``val``이라는 키워드를 사용한다.
    val num: Int = 10

    val str: String = "Hello World!"
//    str = "ABCD"  (상수를 변경하려는 시도 --> 컴파일 에러 )

    println(num1)
    println(num2)
    println(num4)
    println(str)

}
