package chap13

/**
 * 일반 메서드인 부모의 메서드를 추상메서드로 변경할 수도 있다.
 * 이전의 코드의 Book 클래스를 오픈 클래스로 변경하고, EBook을 추상클래스로 만들었다.
 * Book의 readContent 메서드는 일반 메서드이지만 EBook에서는 추상클래스로 변경했다.
 */
open class Book1 {
    open fun readContent(page: Int) {}
}

abstract class EBook1 : Book() {
    abstract override fun readContent(page: Int)
}
