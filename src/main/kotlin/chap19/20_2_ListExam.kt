package chap19

/**
 * 또한 리스트는 자바에서와 같이 get() 메서드를 통하지 않고 배열처럼 대괄호를 통해 요소에 접근이 가능하다.
 * 아래의 코드를 보면 for문 안에서 list[idx]의 형식으로 배열의 요소에 접근하는 것을 볼 수 있다.
 */
fun main() {
    val list = listOf("A", "B", "C", "D", "E")

    for (idx in list.indices) {
        println(list[idx])
    }
}
