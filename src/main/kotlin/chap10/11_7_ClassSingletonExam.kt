package chap10

/**
 * 싱글톤이란 클래스가 객체를 1개만 생성할 수 있도록 만드는 디자인 패턴 중 하나이다.
 * 코틀린에서는 이 싱클톤패턴을 쉽게 만들 수 있도록 object 키워드를 제공한다. 이를 사용하면 클래스가 싱글톤으로 자동으로 만들어지며,
 * 사용은 자바에서 static 변수와 메서드를 사용하듯이 별도의 객체생성코드 없이 사용할 수 있다.
 *
 * 아래의 코드를 보자 main함수를 보면 자바의 static 멤버를 사용하듯이 클래스명.변수명, 캘래스명.메서드명 형태로 사용하고 있다.
 * 이는 유틸리티 클래스 등의 객체를 많이 생성할 필요가 없는 경우에 많이 사용된다. 이 코드의 실행결과는 아래와 같다.
 */
object SingletonClass {
    val str = "Hello World"

    fun sum(a:Int, b:Int): Int {
        return a + b
    }
}

fun main() {
    println(SingletonClass.str)

    val number = SingletonClass.sum(5, 10)
    println(number)
}
