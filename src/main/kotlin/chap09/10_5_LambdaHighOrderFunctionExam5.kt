package chap09

/**
 * 마지막으로 눈치챘겠지만 이 람다 표현식은 함수 리터럴이다. 즉 함수지만 변수처럼 사용될 수 있다는 점이다.
 * 매개변수로 함수를 선언할 때의 형식이 타입이고, 넘길 때의 형식이 값이다.
 *
 * 아래의 코드를 보면 main함수의 두 minus 변수는 같은 내용이다. minus1은 람다표현식을 사용해 내용을 정의했고,
 * minus2는 기존 정의된 minus함수의 내용을 집어넣었다.
 *
 * 자바로 비슷한 비유를 하자면 minus1은 익명클래스를 이용해 객체 생성을 한 것이고,
 * minus2는 기존 생성되어있는 객체를 넣은 것이라고도 비유할 수 있다.
 */
fun main() {
    val minus1: (Int, Int) -> Int = { a, b -> a - b }
    val minus2: (Int, Int) -> Int = ::minus

    println(minus(10, 1))
    println(minus1(10, 1))
    println(minus2(10, 1))
}

fun minus(a: Int, b: Int): Int {
    return a - b
}
