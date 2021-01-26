package chap08

/**
 * 가변인자
 * 또한 함수에는 가변인자를 사용할 수 있다. 가변인자는 "vararg" 키워드를 사용한다. (var arg... 붙임말이 아닐까 싶다?)
 *
 * 사용은 매우 간편하다. printNumbers 함수는 가변인자 numbers를 받는다. 그리고 main 함수에서는 가변인자로 1,2,3,4를 임의로 넘겨주었다.
 *
 * 출력내용은 가변인자로 모든 요소들을 for-each문으로 순서대로 출력시켜 1,2,3,4가 출력된다.
 */
fun main() {
    printNumbers(1, 2, 3, 4)
}

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}
