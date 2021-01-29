package chap13

/**
 * 다중 상속일 경우는 super에 제네릭 타입을 붙여 부모를 구분할 수 있다.
 * 아래의 코드를 보면 Child는 부모 2개를 다중상속받는다. 그리고 두 부모는 같은 이름의 메서드를 갖고있기 때문에
 * 누구의 속성을 사용할지 애매하다.
 *
 * 그래서 super에 제네릭 타입을 사용해 각 부모를 구분하고 그에 맞는 기능을 사용할 수 있다.
 */
interface Parent1 {
    val str: String

    fun myMethod() {
        println("chapter2.Parent1")
    }
}

interface Parent2 {
    val str: String

    fun myMethod() {
        println("chapter2.Parent2")
    }
}

class Child2: Parent1, Parent2 {
    override val str: String = "chapter2.Child"

    override fun myMethod() {
        super<Parent1>.myMethod()
        super<Parent2>.myMethod()
    }
}

fun main() {
    val child = Child()
    child.myMethod()
}
