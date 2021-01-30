package chap18

/**
 * typealias (type alias : alias가 '가명' 이라는 뜻이 있음, 별칭 정도로 생각하면 될듯!)
 *
 * 이 typealias는 코틀린 1.1에 새로 추가된 문법이다. 이 문법을 통해 클래스에 별칭을 붙여줄 수 있다.
 * 실제로 코틀린에서는 ArrayList, HashMap, HashSet 등의 java.utils 패키지의 Collections를 이 typealias를 통해
 * import 없이 바로 사용할 수 있도록 구현되어 있다.
 *
 * 아래의 코드를 보자. typealias 키워드를 통해 ArrayList<String>에 StringArrayList라는 별칭을 붙여주었다.
 * 그리고 이 별칭을 통해 객체를 생성하고 사용해보았다.
 */

typealias StringArrayList = ArrayList<String>

fun main() {
    val strArrayList = StringArrayList()

    strArrayList.add("Hi")
    strArrayList.add("Hello")

    println(strArrayList)
}
