package chap11

/**
 * 오픈클래스
 * 코틀린에도 자바나 다른 객체지향 언어와 같이 상속이라는 개념이 존재한다. 코틀린에서 클래스와 메서드 모두 기본적으로 final이다.
 * 그래서 클래스를 상속받고, 재정의하려면 별도의 "open" 이라는 키워드를 붙여주어야한다. 이를 **오픈클래스**라고 하며 이 클래스는 상속을 허용한다는 의미이다.
 *
 * 클래스를 공부하며 봤던 Book클래스를 오픈클래스로 바꾼 형태는 다음과 같다.
 *
 * 바뀐 점이 두 곳 있는데. "class" 키워드의 앞에 "open" 키워드를 추가해줬고, printInfo()라는 메서드를 추가했다.
 * 다만 이 메서드의 앞에도 "open" 키워드를 사용하여 오버라이딩이 가능하다고 명시했다.
 */
fun main() {
    val book = Book("tt", "au")
    book.printInfo()

    val ebook : OpenBook = Ebook()
    println(ebook.serialNumber)
}

open class Book() {
    var title: String = ""
    var author: String = ""

    constructor(title: String) : this() {
        this.title = title
    }

    constructor(title: String, author: String) : this(title) {
        this.author = author
    }

    open fun printInfo() {
        println("제목은 $title, 저자는 $author 입니다.")
    }
}

/**
 * 특이한 점으로 코틀린은 멤버변수나 상수까지도 오버라이딩이 가능하다. 변수에도 open 키워드를 사용하면
 * 자식클래스에서 변경이 가능하다는 말이다. 다음 코드를 보자
 *
 * 매우 간단한 예제인데 보이는 그대로 상수와 변수를 각각 재정의했다. 물론 부모가 갖고있는 값에도 super 키워드를
 * 사용해 접근할 수 있다.
 */
open class OpenBook() {
    open val serialNumber = 5555
    open val price = 1000
}

class Ebook : OpenBook() {
    override val serialNumber = 7777
    override val price = 5000
}
