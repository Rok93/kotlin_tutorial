package chap18

/**
 * 멤버참조 연산자
 * 1.1버전부터 자바처럼 :: 연산자를 이용해 람다 대신 멤버참조를 할 수 있다.
 * 아래의 코드를 보자. Filter에는 인자가 10보다 큰지 여부를 가려주는 메서드가 있다.
 * 그리고 main함수에서 숫자 리스트를 생성하고 이를 filter를 사용하고 10보다 큰 값만 추려내려한다.
 *
 * 여기서 Filter 객체의 over10 메서드를 멤버참조로 넘겼다. filter의 인자는 1개뿐이므로 그 1개뿐인 인자가
 * over10 메서드의 인자로 자동으로 넘어간다. 그리고 over10 메서드는 그 값이 10보다 큰지 검사하여 Boolean 형태로 리턴한다.
 * 이를 바탕으로 요소들을 걸러내게 되고 newList에는 [15,20,25,30]이 들어가게 된다.
 */
fun main() {
    var filter = Filter()
    var list = listOf(0, 5, 10, 15, 20, 25, 30)

    val newList = list.filter(filter::over10)
    println(newList)
}

class Filter {
    fun over10(i: Int) = i > 10
}
