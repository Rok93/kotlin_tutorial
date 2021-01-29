package chap11

/**
 * 오픈클래스를 정의하고 상속받아 사용하는 전체 코드는 아래의 코드와 같다.
 * 코드를 보면 Ebook 클래스를 선언할 때 콜론(:) 뒤에 생성자를 호출함으로써 Book 클래스를 상속받았음을 나타냈다.
 */
fun main() {
    val book = Book("Kotlin", "Daniel")
    val ebook2 = Ebook2("Kotlin", "Daniel", "http://devdogs.kr")

    book.printInfo()
    ebook2.printInfo()
}

class Ebook2(title: String, author: String, var url: String?) : Book(title, author) {

    constructor() : this("", "", null)

    override fun printInfo() {
        println("제목은 $title, 저자는 $author, 접속 URL은 $url 입니다.")
    }
}
