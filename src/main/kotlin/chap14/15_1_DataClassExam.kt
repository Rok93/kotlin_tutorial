package chap14

/**
 * 데이터 클래스
 * 단순히 값을 담는 클래스를 자바에서는 Value Object(VO) 혹은 Data Transfer Object(DTO)라고 불렀다.
 * 이러한 데이터를 담는 클래스를 코틀린에서는 기본적인 기능으로 제공하며 데이터 클래스라고 부른다.
 *
 * 또한 데이터클래스는 멤버 변수에 대한 getter를 자동으로 제공한다. 하지만 setter는 변수의 타입에 따라 상수(val)일 경우에는 제공하지 않는다.
 * 상수인 값을 변경하고자 할 때에는 copy 메서드를 통해 값이 변경된 새로운 객체를 생성한다.
 * 데이터 클래스에 대한 예제는 다음 코드를 보자. 데이터클래스의 선언은 매우 간단하다.
 */

data class Book(val title: String, val author: String, val price: Int)

fun main() {
    val book = Book("Kotlin", "Daniel", 10_000)

    println("${book.title} / ${book.author} / ${book.price}")
}
