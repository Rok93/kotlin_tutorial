package chap12

/**
 * 익명클래스
 * 익명클래스를 선언할 때는 자바와 다르게 object 키워드를 명시적으로 붙여주어야 한다.
 *
 */
fun main() {
    val listener = object : OnClickListener() {
        override fun onClick() {
            println("익명 클래스 재정의")
        }
    }

    listener.onClick()
}

// 상속이 가능한 Listener를 구현했다. 그리고 메인 함수에서는 object 키워드를 붙여 OnclickListener의 익명클래스를 선언했다.
// 이처럼 매우 간단하게 익명클래스를 선언할 수 있다.
open class OnClickListener {
    open fun onClick() {}
}
