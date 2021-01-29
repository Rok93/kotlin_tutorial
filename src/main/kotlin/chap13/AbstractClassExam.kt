package chap13

/**
 * 추상클래스
 * 추상클래스의 개념과 사용법은 자바와 동일하다. abstract 키워드를 사용해 선언하는 것까지 똑같다.
 * 다만 코틀린에서는 추상메서드가 아닌 부모의 메서드를 자식이 추상메서드로 변경해서 사용할 수 있다는 점이다.
 *
 * 먼저 아래의 코드를 보면 추상클래스와 추상메서드를 선언하는 예제이다.
 * 이를 상속받은 클래스는 일반적인 클래스 상속처럼 override 키워드만 붙여주면 된다. 다만 추상클래스의 특성상
 * 추상메서드는 꼭 자식이 오버라이딩하지 않으면 컴파일 에러가 발생하는 제약이있다.
 */
fun main() {
    val eBook = EBook()
    eBook.readContent(1)
}

abstract class Book {
    abstract fun readContent(page: Int)
}

class EBook: Book() {
    override fun readContent(page: Int) {
        println("${page}의 내용")
    }

}
