package chap02

import java.util.Random as R

fun main(args: Array<String>) {
    /**
     * 코틀린의 패키지 개념은 자바와 동일하다. 작명 규칙 또한 도메인을 뒤집는 것도 똑같다.
     *  패키지 선언은 package 키워드를 통해하며 사용방법은 주석 아래의 예와 같다.
     *  package kr.devdogs.kotlinbook.chapter2
     */

    /**
     * 코틀린은 기존 자바의 모든 라이브러리들을 사용할 수 있다. 기본 자바 API는 물론 스프링 등의 프레임워크까지 사용가능하다.
     * import로 타 패키지의 클래스를 가져올 때의 문법도 자바와 동일하다. 하지만 코틀린에서는 파이썬 등의 언어처럼 "as" 키워드를 통해
     * import한 클래스에 별명을 붙이는 것이 가능하다.
     */

    // 단 * 와 같이 와일드 카드는 안된다!
    val random = R()
    val randomNumber = random.nextInt()

    println("랜덤하게 뽑은 숫자는  ${randomNumber} 입니다.")

    /**
     * import를 할 때 클래스 뿐만 아니라 함수까지도 import가 가능하다.
     */
    println(multiply(10, 20))

}

// 이 함수가 다른 파일에 있다고 가정했을 때, 같은 파일내에 multiply함수가 있진 않지만 import를 통해 가져와 사용할 수 있다.
fun multiply(a: Int, b: Int): Any? {
    return a * b
}


