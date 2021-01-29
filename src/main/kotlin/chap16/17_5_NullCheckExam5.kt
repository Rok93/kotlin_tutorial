package chap16

/**
 * 또한 "?:" 연산자로 값을 검사하여 null일 경우 메서드를 리턴하거나 breaksk continue의 흐름제어도 가능하다.
 * 다음 코드를 보자!
 *
 * NullCheckExam2 클래스는 싱글톤 형식으로 정의했다. nullCheckReturn 메서드를 보면 str이 null인지를
 * 검사하여 null이라면 그냥 리턴하고, 값이 있다면 그것을 출력하는 메서드이다. main함수에서 처음에 null을 넘겼을 경우에는
 * 값을 출력하지 않고 바로 메서드가 종료될 것이다.
 *
 * 하지만 두 번째에 "Hello World"를 넘겼을 때에는 매개변수인 str이 null이 아니므로 "Hello World!"를
 * 출력하고 메서드가 종료된다. 그리고 nullCheckBreak 메서드를 보면 배열을 받아 그 요소들을 순서대로 출력하는데
 * 요소가 값이 null이라면 반복을 종료하는 예제이다.
 *
 * 우리가 main 함수에서 정의한 배열에서 "A"와 "B" 다음에 null이므로 이 배열을 nullCheckBreak 메서드로 넘겼을
 * 경우에 "A"와 "B"만 출력하고 종료될 것이다.
 */
fun main() {
    NullCheckExam2.nullCheckReturn(null)
    NullCheckExam2.nullCheckReturn("Hello World!")

    val arr = arrayOf("A", "B", null, "C", "D")
    NullCheckExam2.nullCheckBreak(arr)
}

object NullCheckExam2 {
    fun nullCheckReturn(str: String?) {
        str ?: return
        println(str)
    }

    fun nullCheckBreak(arr: Array<String?>) {
        for (i in arr) {
            i ?: break
            println(i)
        }
    }
}
