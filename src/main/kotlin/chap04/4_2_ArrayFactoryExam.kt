package chap04

fun main(args: Array<String>) {
    /**
     * 또한 크기와 값 생성함수를 인자로 받는 팩토리를 사용할 수도 있다.
     * ** 아래의 코드**는 이를 통해 배열을 생성하는 예제이다. Array의 2번째 인자로 람다식이 들어간다.
     * 함수형 언어를 경험했거나, 자바8을 사용해본 독자는 아마 알고 있을 것이다.
     *
     * Array에서는 두 번째 인자로 넘어온 함수의 리턴 값 타입을 유추하여 자동으로 배열의 제네릭타입을 결정한다.
     * 저 함수의 리턴타입은 String이기에 arr 변수에 담기는 배열은 String 배열이다.
     */

    val arr = Array(5) { i -> i.toString() } //Array(5, { i -> i.toString() })을 IDE로 자동 변환 시키니 이렇게 바뀜

    println(arr is Array<String>)
    println(arr.contentToString())

    /**
     * 이는 첫 번째 출력무넹서 확인해볼 수 있다. arr의 타입을 먼저 예상해보자면 Array의 두 번째 인자로 넘어간 함수는
     * String 타입을 리턴하므로 Array<String> 타입일 것이다.
     *
     * 첫 번째 출력문은 true를 출력할 것이고, 두 번째 출력문에서는 각 인덱스를 넣었으므로 0부터 4까지의 숫자가 출력된다.
     */
}
