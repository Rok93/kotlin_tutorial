package chap14

/**
 * 하지만 15_1 예제처럼 선언한다면 매개변수가 없는 생성자로 객체생성을 하지 못한다.
 * 그러므로 매개변수가 없는 빈 객체를 만들고 싶다면 아래의 코드처럼 데이터클래스의 모든 속성에 기본값을 주어야 한다.
 */

data class Book2(
    val title: String = "No Title",
    val author: String = "No Author",
    val price: Int = 0,
)

fun main() {
    val book = Book2()
    println("${book.title} / ${book.author} / ${book.price}")
}
