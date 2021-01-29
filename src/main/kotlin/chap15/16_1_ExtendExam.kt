package chap15

/**
 * 확장
 * 자바와 다르게 코틀린에서는 확장이라는 개념이 있다. 이 확장은 쉽게 말하자면 기존 클래스에 메서드를 추가하거나,
 * 기존 메서드의 기능을 확장할 수 있는 기능이다. 이 확장기능을 사용하면 메서드의 기능을 확장하려고 굳이 **데코레이터 패턴** 같은
 * 디자인 패턴을 사용하지 않아도 된다.
 *
 * 확장의 예는 아래의 코드를 보자. 간단한 계산기 클래스를 만들었다. 기존에는 두 개의 숫자를 더해주는 메서드만을 갖고 있다.
 * 하지만 확장기능을 통해 세 개의 숫자를 더할 수 있도록 기능을 확장시켰다.
 *
 * 확장함수 내부의 스코프는 클래스 내부에서 메서드를 선언하는 것과 동일하다. 마치 오버로딩을 하는 것처럼 사용이 가능하다.
 * 즉 내부에서 사용하는 것과 마찬가지이므로 this와 super도 사용이 가능하다는 것이다.
 * 다만 확장함수를 사용할 때에 주의점은 재정의는 안된다는 것이다. 재정의라 함은 오버라이딩과 같이 기존의 메서드와 매개변수, 반환형이
 * 전부 동일하면 안된다. 컴파일 에러는 뜨지 않지만 적용이 되질 않는다.
 */
fun main() {
    val calculator = Calculator()
    println(calculator.sum(1, 2, 3))
    println(calculator.minus(10, 2))
}

class Calculator {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

fun Calculator.sum(a: Int, b: Int, c: Int): Int {
    return sum(a, b) + c
}

fun Calculator.minus(a: Int, b: Int): Int {
    return a - b
}
