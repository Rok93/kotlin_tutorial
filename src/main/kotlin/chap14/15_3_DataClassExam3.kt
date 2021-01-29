package chap14

/**
 * 상수인 값을 변경하려면 값이 변경된 새로운 객체를 생성해야만 한다. 이는 copy() 메서드를 통해 한다.
 * 아래의 코드를 보면 copy 메서드를 통해 가격만 변경된 새로운 객체를 생성한다. 또한 값을 변경할 수 있는 필드인 price의 값을 변경해서 출력했다.
 *
 * book2는 값이 새로 입력되지 않은 제목은 "Kotlin", 저자는 "Daniel"의 값이 그대로 들어있고, 가격만 20000원으로 변경된 새로운 객체이다.
 * 그래서 마지막 줄의 객체비교를 하면 false가 출력된다.
 *
 * 또한 price 필드는 변경이 가능하므로 마지막에는 book2의 price가 30000원으로 바뀌어서 출력된다.
 */
fun main() {
    val book = Book1("Kotlin", "Daniel", 10000)
    println("${book.title} / ${book.author} / ${book.price}")

    val book2 = book.copy(price = 20000)
    println("${book2.title} / ${book2.author} / ${book2.price}")

    println(book == book2)

    book2.price = 30000
    println("${book2.title} / ${book2.author} / ${book2.price}")
}

data class Book1(val title: String, val author: String, var price: Int = 0)

