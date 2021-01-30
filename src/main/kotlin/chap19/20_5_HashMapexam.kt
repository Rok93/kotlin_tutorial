package chap19

/**
 * 수정이 가능한 Map은 java.util.HashMap 클래스를 이용한다. 이 역시 typealias를 사용하여 import 없이 바로 사용할 수 있다.
 *
 * 아래의 코드를 보자. HashMap 객체를 생성한 다음, 여기서는 리스트와 다르게 대괄호로 존재하지 않는 키의 요소에도 값을 부여할 수 있다.
 * 동일한 내용의 자바코드를 작성하는 것보다 많이 보기 좋아지는 효과가 있다.
 *
 * 또한 HashMap 객체를 사용하는 대신 hashMapOf() 메서드를 사용해서도 HashMap을 생성할 수 있다.
 */
fun main() {
    var map = HashMap<String, String>()

    map["A"] = "Joongsoo"
    map["B"] = "Younghwan"
    map["C"] = "Minji"

    println(map["A"])
    println(map["B"])
    println(map["C"])

    val map2 = hashMapOf<String, String>()

    map2["A"] = "Joongsoo"
    map2["B"] = "Younghwan"
    map2["C"] = "Minji"

    println(map2["A"])
    println(map2["B"])
    println(map2["C"])
}
