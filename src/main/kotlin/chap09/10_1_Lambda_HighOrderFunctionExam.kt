package chap09

/**
 * 고차함수 (High Order Function)
 * 고차함수는 함수를 일반 자료형이나 객체처럼 인자로 받거나, 리턴할 수 있는 함수이다.
 * 자바스크립트나 하스켈 등 함수형 언어를 써 본 사람은 함수를 인자로 넘기거나 리턴하는 것을 경험했을 것이다.
 *
 * 인자로 넘어가는 함수는 콜백이라고 흔히 불리워지며, 이는 자주 들어본 사람이 있을 것이다. 고차함수로 인해 되불려지기 때문에 이렇게 불린다.
 *
 * 콜백이 자주 사용되는 예는 안드로이드에서 보자면 버튼 등의 뷰에 이벤트에 대한 반응을 정의할 때이다.
 * 예를 들어 버튼이 클릭됬을 때 호출되는 onClick 메서드가 있다. 자바에서는 8버전이 나오기 전에 람다가 존재하지 않았기 떄문에
 * 각 Listener 인터페이스를 구현하여 넘기거나, 익명클래스 형식으로 콜백을 넘기는 방식을 사용했다. (안드로이드는 현재도 그렇게 사용하고 있다.)
 *
 * 이름만 고차함수이지 사용법은 일반 함수와 똑같다. 다만 인자를 받을 때 함수인자를 정의하는 부분만 람다라는 표현식을 사용한다.
 * 먼저 고차함수를 정의할 때 함수를 표현하는 람다의 형식은 아래와 같다. 예제1의 함수는 인자도 없고 리턴값도 없는 함수이다.
 * 스레드의 run() 메서드를 예로들 수 있다. 또한 예제2의 함수는 정수 2개를 받아서 정수를 리턴하는 타입의 함수라는 뜻이다.
 *
 * (인자타입1, 인자타입2) -> 반환형
 *
 * 예제1) () -> Unit
 * 예제2) (Int, Int)->Int
 *
 * 자바에서 람다는 함수를 사용하는 입장에서는 쉽지만 함수를 정의하는 입장에서는 람다를 받는 메서드를 작성하기 위해서는 꽤나 귀찮은 작업이 필요했다.
 * 반드시 람다의 형식으로 사용할 함수를 인터페이스로 감싸야했기에 함수 하나를 정의할 때마다 인터페이스로 정의해야했다. 이를 해결하기 위해
 * 미리 정의된 인터페이스들도 있었으나 사용하기 불편한 것은 마찬가지였다.
 *
 * 아래의 코드는 인자가 없는 함수들의 예제이다. 코틀린에서 람다는 매개변수가 없거나,
 * 1개뿐일 때 표현식에서 중괄호와 화살표 "() ->"를 생략할 수 있다.
 *
 * 먼저 아래의 코드는 인자가 없는 함수를 사용하는 예제다.
 * main 함수에서 invokeFunction1을 보면 매개변수가 함수 1개 밖에 없다. 다른 매개변수를 받지 않기 때문에 함수를 호출할 때 소괄호마저
 * 생략하고 바로 중괄호로 코드블럭을 전달할 수 있다.
 *
 * 또한 invokeFunction2를 보면 매개변수가 2개이기 때문에 소괄호는 생략하지 않는다. 또한 특이점은 인자로 받는 함수에서 매개변수는 받지 않지만
 * String을 리턴하는 타입의 함수를 받는다. 그래서 코드블럭을 전달할 때 코드블럭의 맨 마지막 라인에 있는 "리턴 문자열"이 리턴되어
 * invokeFunction2의 returnValue 변수에 값이 들어가게 된다.
 *
 * 그리고 마지막으로는 스레드 5개를 호출했는데 스레드 또한 매개변수가 없는 함수(run)를 전달받기 때문에 소괄호를 생략하고 중괄호만으로도 생성자를 호출할 수 있었다.
 *
 */
fun main() {
    invokeFunction1 { println("콜백 함수 실행") }

    /**
    invokeFunction2(10, {
    println("콜백함수 여러줄 실행")
    "리턴 문자열"
    })
    원래 위의 식인데 아래와 같이 람다식으로 변경할 수 있다!
     */
    invokeFunction2(10) {
        println("콜백함수 여러줄 실행")
        "리턴 문자열"
    }

    for (i in 1..5) {
        Thread {
            println("${i}번 스레드 ")
        }.start()
    }
}

fun invokeFunction1(f: () -> Unit) {
    f()
}

fun invokeFunction2(num: Int, f: () -> String) {
    println("인자로 받은 숫자 : $num")
    val returnValue = f()
    println(returnValue)
}


