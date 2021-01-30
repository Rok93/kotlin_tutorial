package chap19

/**
 * 그렇다면 수정이 가능한 리스트를 만들려면 어떻게 해야할까? 답은 ArrayList를 사용하면 된다.
 * ArrayList를 선언하는 방법도 List와 마찬가지로 두 가지가 있다.
 *
 * 아래의 코드를 보자. ArrayList 클래스의 생성자로 객체를 만들 수 있다. 이 ArrayList는 java.util.ArrayList이지만
 * 따로 import를 해주지 않아도 된다. 코틀린 1.1버전에서 추가된 typealias로 코틀린의 collections 패키지에 따로 공유됬기 때문이다.
 * 객체를 생성한 이후는 자바와 똑같이 add 메서드로 추가할 수 있다. list1에는 [0,1]이 들어갔다.
 *
 * 그리고 두 번째로 arrayListOf 함수를 사용하는 것이다. 사용법은 List와 동일하다.
 * 또한 대괄호로 요소에 접근할 수 있다. 다만 배열과 똑같이 대괄호로 접근하는 것은 리스트의 사이즈 내에서만 접근이 가능하다.
 * 만약 그 리스트의 영역을 벗어난 곳에 접근하려 한다면 IndexOutOfBoundException이 발생한다. list2에는 [10,1,2,3,4,20]의 요소가 들어가게 된다.
 */
fun main() {
    val list1 = ArrayList<Int>()
    list1.add(0)
    list1.add(1)
    println(list1)

    val list2 = arrayListOf(0, 1, 2, 3, 4)
    list2[0] = 10
    list2.add(20)
    println(list2)
}
