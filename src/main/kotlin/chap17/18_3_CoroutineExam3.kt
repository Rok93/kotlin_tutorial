package chap17

/**
 * take를 거치지 않고 buildSequence의 모든 코드블록이 끝난 결과를 리턴받을 수도 있다.
 *
 * 아래의 코드를 보자 take를 사용하지 않고 바로 toList()를 사용하였다. 이는 buildSequence의 코드블록이
 * 끝이 있는 구문이기에 가능했다. 만약 이전 코드들과 같이 무한루프가 있는 코루틴에 이렇게 한다면 무한루프에 빠져버릴 것이다.
 *
 * 추가적으로 buildSequence의 결과로 나온 시퀀스에 toList() 메서드뿐만 아니라 forEach 등의 구문도 쓸 수 있다.
 */
fun main() {
    val seq = sequence<Any> {
        for (i in 0..10 step 2) {
            yield(i)
        }
    }

    val list = seq.toList()
    println(list)

    seq.forEach {
        println(it)
    }
}
