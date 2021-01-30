package chap19

/**
 * 또한 코틀린에서는 자바와 다르게 stream()이나 parallelStream()을 호출하지 않고도 filter, map, sort 등의
 * 스트림 연산을 할 수 있다.
 *
 * 아래의 코드를 보자. filter 메서드로 2보다 큰 수만 남겼다. 이 때 남은 요소들은 [3,4,5]이다. 그리고 모든 요소에 1을 더해주었다.
 * 그러면 요소들은 [4,5,6]이 된다.
 *
 * 그 다음에 내림차순으로 정렬시켰다. 정렬할 때 요소의 값 그대로를 정렬의 기준으로 설정하였다. 최종적으로 아래의 출력은
 * [6,5,4]가 된다.
 */
fun main() {
    val list = arrayListOf(0, 1, 2, 3, 4, 5)

    val newList = list.filter { it > 2 }
        .map { it + 1 }
        .sortedByDescending { it }
    println(newList)
}
