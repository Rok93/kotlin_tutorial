package chap19

/**
 * Map 역시 수정이 불가능한 Map과 수정이 가능한 HashMap이 있다. 먼저 수정이 불가능한 일반 Map 아래의 코드와 같이 생성하고 사용할 수 있다.
 *
 * mapOf 메서드는 Pair라는 타입의 가변인자를 받는다. Pair는 말 그대로 키, 값 쌍으로
 * 첫 번째 인자가 키, 두 번째 인자가 값이다. 이렇게 키, 값 쌍의 여러 인자를 넣어 map을 생성할 수 있다.
 *
 * 또한 이는 리스트와 비슷하게 대괄호로 [키] 형식으로 요소에 접근을 할 수 있다.
 * 결과는 mapOf 함수에 넣은 순선대로 값들이 출력된다.
 */
fun main() {
    val map = mapOf(
        Pair("A", "Joongsoo"),
        Pair("B", "Younghwan"),
        Pair("C", "Minji")
    )

    println(map["A"])
    println(map["B"])
    println(map["C"])
}
