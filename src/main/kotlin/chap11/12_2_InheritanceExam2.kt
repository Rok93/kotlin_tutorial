package chap11

/**
 * 오픈클래스를 정의하고 상속받아 사용하는 전체 코드는 아래의 코드와 같다.
 * 코드를 보면 Ebook 클래스를 선언할 때 콜론(:) 뒤에 생성자를 호출함으로써 Book 클래스를 상속받았음을 나타냈다.
 */

/**
 * 하지만 Book 클래스를 선언할 때와 다른 점이 있다. 주 생성자에 매개변수 3개를 사용했고,
 * 그 3개 중 "title"과 "author"를 부모클래스인 Book의 생성자에 넘겼다. 그리고 세 번째 인자인 url에는 "var" 키워드가 붙어있다.
 *
 * 먼저 var 키워드에 대해 설명하자면 var 혹은 val 키워드를 붙인 주 생성자의 매개변수는 그대로 클래스의 멤버변수가 된다.
 * Book 클래스처럼 멤버변수를 클래스 내부에서 선언할 때에는 무조건 null값으로라도 값을 초기화 시켜줘야 한다.
 * 하지만 Ebook클래스처럼 주생성자에 멤버변수를 선언한다면 값을 초기화해주지 않아도 된다.
 *
 * 두 번째로 주 생성자에서 받은 매개변수를 바로 부모 생성자의 매개변수로 전달할 수 있다.
 * Ebook의 주생성자를 보면 첫 번째와 두 번째 매개변수를 부모클래스인 Book의 생성자에 전달했다.
 *
 * 또한 비어있는 클래스를 생성 가능하게 하기 위해 보조생성자를 이용해 매개변수가 없는 생성자를 선언했다.
 * 구현 내용이 없으므로 중괄호({})는 생략했고, 주 생성자에 빈 값들을 전달했다.
 * title과 author는 NULL값을 받을 수 없는 자료형이므로 공백 문자열을 넘겨주었다.
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
