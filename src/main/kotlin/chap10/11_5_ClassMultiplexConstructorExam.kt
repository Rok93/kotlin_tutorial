package chap10

/**
 * 그렇다면 여러 생성자가 있을 경우 어떻게 처리해야할까? 아래의 코드를 보면 알 수 있다.
 * 각 보조 생성자를 보면 메서드처럼 콜론(:) 뒤에 자신의 생성자를 재호출하는 것을 볼 수 있다.
 * 코틀린에서 여러 생성자 처리는 이렇게 다른 생성자에게 나머지 역할을 위임하는 식으로 한다.
 */

fun main() {
    val book1 = Book2()
    val book2 = Book2("title", "author")
}

class Book2() {
    var title: String = ""
    var author: String = ""

    constructor(title: String) : this() {
        this.title = title
    }

    constructor(title: String, author: String) :this(title) {
        this.author = author
    }
}
