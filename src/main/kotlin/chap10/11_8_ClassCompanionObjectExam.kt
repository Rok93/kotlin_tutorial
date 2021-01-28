package chap10

/**
 * Companion Object
 * 동반 객체는 쉽게 생각하면 자바에서의 static이라 생각하면 된다. 객체를 여럿 생성하는 일반 클래스에도 내부에 Companion Object를
 * 선언하면 이를 객체생성 없이 static 요소처럼 바로 사용할 수 있다. 또한 Companion Object는 한 클래스에 하나만 선언할 수 있다.
 *
 * 아래의 코드를 보자. main 함수를 보면 먼저 클래스의 객체생성을 했다. 객체 생성을 하면 Companion Object의 변수와 메서드를
 * 사용할 수 없다. 사용하려면 무조건 객체생성방식이 아닌 클래스 이름으로 바로 호출하는 방식을 사용해야한다.
 *
 * 그 다음을 보면 minus 메서드를 호출하는 두 줄이 있다. 이처럼 Companion Object의 요소들은 그냥 호출해도되고,
 * Companion Object의 이름을 매개체로 호출해도 된다. 그 다음의 str2 상수를 출력하는 것도 마찬가지이다.
 *
 * 그리고 마지막에선 멤버상수와 Companion Object의 상수 이름이 겹친다. 이는 값을 가져오는 방식 자체가 다르므로 크게 신경을 쓰지 않아도 된다.
 *
 * 또한 Companion Object는 이름을 생략해도 된다. 이름을 생략해도 자바의 static 요소처럼 바로 가져와서 사용하면 된다.
 */

class CompanionTestClass {

    val str1 = "Hello!"
    val str3 = "Korea!"

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    companion object {
        val str2 = "Hi!"
        val str3 = "USA!"

        fun minus(a: Int, b: Int): Int {
            return a - b
        }
    }
}

fun main() {
    val obj = CompanionTestClass()
    println(obj.str1)
    println(obj.sum(10, 5))
    println(obj.str3)

    println(CompanionTestClass.minus(10, 5))
    println(CompanionTestClass.Companion.minus(10, 5))

    println(CompanionTestClass.str2)
    println(CompanionTestClass.Companion.str2)

    println(CompanionTestClass.str3)
    println(CompanionTestClass.Companion.str3)
}
