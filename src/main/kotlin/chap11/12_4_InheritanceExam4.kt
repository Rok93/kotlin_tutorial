package chap11

/**
 * EBook 클래스를 다른 클래스에서 추가적으로 상속이 가능하게 하고 싶으면 EBook 클래스에 open 키워드만 붙여주면 된다.
 * 그렇게 한다면 부모에게서 상속받은 printInfo() 메서드는 부모인 Book 클래스에게서 open으로 물려받았기 때문에 EBook 클래스에서의
 * printInfo() 메서드 또한 기본적으로 open이 된다. 그래서 하위 클래스에서 이 메서드를 다시 오버라이딩이 가능하다.
 * printInfo 메서드를 하위 클래스에서 오버라이딩하지 못하게 하려면 "final" 키워드로 막아주면 된다.
 *
 * 아래의 코드를 보자. 매우 간단하다 EBook 클래스를 open 클래스로 바꿔주어 상속이 가능하게 한 다음, printInfo() 메서드를
 * final로 선언하여 상속을 막았다. 그럼 ExtendEBook 클래스는 EBook을 상속받았지만, printInfo 메서드는 재정의하지 못하고
 * 부모의 메서드를 사용한다. 이처럼 open과 final은 상반된 관계이며 상속을 열고 닫는데에 적절하게 사용하면 된다.
 */
open class EBook2 : Book {
    var url: String = ""

    constructor() : super("", "")

    constructor(title: String, author: String, url: String) : super(title, author) {
        this.url = url;
    }

    final override fun printInfo() {
        println("제목은 $title, 저자는 $author, 접속 URL은 $url 입니다.")
    }
}

class ExtendEBook() : EBook2() {
    // override 가능한 메서드 목록에 printInfo 메서드가 x
}

/**
 * 자식클래스의 경우 부모 클래스의 기능을 사용해야하는 경우도 있을 것인데, 이 경계가 모호할 때도 있다.
 * super@자식클래스(현재클래스).메서드명 을 쓴다면, 자식클래스의 부모의 기능을 쓸 수 있다.
 * 또한 this@자식클래스(현재클래스)는 자기 자신을 가리키게 된다!
 */
