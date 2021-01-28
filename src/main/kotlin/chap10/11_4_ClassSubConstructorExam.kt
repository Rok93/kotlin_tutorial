package chap10

/**
 * 주 생성자만 사용하면 생성자를 1개밖에 사용하지 못하므로 보조생성자를 사용해야한다. 보조생성자는 아래의 코드처럼 사용한다.
 * 사용방법은 보면 형식이 자바랑 약간 비슷하다. 클래스 이름을 constructor 키워드를 바꾼 것 뿐이다.
 * public, private 등의 접근제어자도 앞에 붙일 수 있다.
 *
 * 하지만 Book 클래스처럼 주 생성자를 생략한 상태에서 보조생성자를 만들게 되면 주 생성자는 생략이 아니라 아예 없는 것이 된다.
 * 즉 main 함수에서 book1을 생성할 때 에러가 발생한다. 인자가 없는 기본생성자가 없이 때문이다.
 */
fun main() {
//    val book1 = Book() // 컴파일 에러
    val book2 = Book("Kotlin", "Daniel")
}

class Book {
    private val title: String
    private val author: String

    constructor(title: String, author: String) {
        this.title = title
        this.author = author
    }
}
