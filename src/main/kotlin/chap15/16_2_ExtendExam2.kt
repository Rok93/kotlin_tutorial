package chap15

/**
 * 여기서 조금 더 응용하면 다른 클래스의 메서드를 내가 작성한 클래스 내부의 범위에서만 사용할 수도 있다.
 * 만약 확장함수가 유효한 범위를 클래스 내부로 한정시키고 싶을 때 유용할 것이다.
 */

/**
 * 코드를 보자. Calculator 클래스와 기능을 내 클래스 안에서만 확장시키고 싶다. 그래서 MyClass 안에서 확장함수를 선언했다.
 * 이렇게 하면 저 클래스 범위 안에서만 기능의 확장이 가능해진다.
 *
 * 또한 MyClass에서 sum메서드를 재정의할 때 마치 Calculator 클래스 내부에서 정의하는 것처럼 Calculator의 멤버변수인 d를
 * this 키워드를 이용해 불러왔다. 이처럼 확장을 사용할 때, 재정의하는 클래스의 내부에서 사용하는 것처럼 스코프를 활용할 수 있다.
 */
fun main() {
    val myClass = MyClass()
    println(myClass.minus(10, 2))
    println(myClass.sum(1, 2, 3))
}

class Calculator2 {
    val d = 10
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

class MyClass {
    val calc = Calculator2()

    fun Calculator2.sum(a: Int, b: Int, c: Int): Int {
        return sum(a, b) + c
    }

    fun Calculator2.minus(a: Int, b: Int): Int {
        return a - b
    }

    fun sum(a: Int, b: Int, c: Int): Int {
        return calc.sum(a, b, c)
    }

    fun minus(a: Int, b: Int): Int {
        return calc.minus(a, b)
    }
}
