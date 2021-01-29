package chap13

/**
 * 코틀린에서 인터페이스는 선언방법과 형태 모두가 자바와 유사하다.
 * 자바8처럼 메서드의 기본 동작을 정의할 수도 있다. 또한 다중상속이 가능한데 다중상속을 받을 때 super 키워드로 부모를 구분하기 애매하다.
 * 그래서 제네릭처럭 부모를 구분할 수 있는 기능도 제공한다.
 *
 * 간단한 인터페이스의 예제는 아래의 코드를 보자.
 *
 * 인터페이스는 기본적으로 open이기에 모든 것을 바로 오버라이딩할 수 있다. 오픈클래스, 추상클래스와 마찬가지로
 * 상수도 오버라이딩이 가능하다.
 */
fun main() {

}

interface Parent {
    val str: String

    fun myMethod()
}

class Child : Parent {
    override val str: String = "Child"

    override fun myMethod() {
        //Child Override
    }

}
