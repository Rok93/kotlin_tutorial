package chap11

/**
 * 또한 보조생성자를 이용해서도 부모클래스의 생성자에 값을 넘길 수 있다.
 * 위의 코드에서 Ebook 클래스만 변경해봤다. 아래의 코드를 보자.
 *
 * 주 생성자를 이용하지 않고 보조생성자만 이용했기 때문에 상속을 받을 때에도 Book의 생성자를 사용하지 않았다.
 * 보조 생성자를 이용할 때에는 클래스의 이름을 사용하지 않고, "super" 키워드를 이용한다.
 */

class EBook : Book {
    var url: String = ""

    constructor() : super("", "")

    constructor(title: String, author: String, url: String) : super(title, author) {
        this.url = url
    }

    override fun printInfo() {
        println("제목은 $title, 저자는 $author, 접속 URL은 $url 입니다")
    }
}

fun main() {
    val eBook = EBook("t", "a", "u")
    eBook.printInfo()
}
