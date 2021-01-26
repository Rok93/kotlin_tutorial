package chap07

import java.io.IOException

fun main() {
    /**
     * 코틀린의 기본적인 try-catch문법은 자바와 거의 동일하다.
     * 자바에서는 RuntimeException을 상속받은 비체크 예외들을 제외한 체크 예외에 대해서는 try-catch 혹은 throws 처리를 강제했었다.
     * 하지만 코틀린에서는 모든 예외들을 비체크 예외이다. 즉 예외처리를 강제하지 않는다. 예를들어 IOException을 처리하지 않아도
     * 컴파일 과정에서는 오류가 발생하지 않는다. 물론 예외처리를 하지 않았으므로 런타임에는 예외가 발생하게 된다.
     *
     * 또한, throwIOException 함수를 보면 throws를 사용해 자신을 호출한 코드에 책임전가를 하지 않는다.
     * 코틀린에서는 이러한 책임전가를 지원하지 않는다. 그 이유는 위에서 예외처리를 강제하지 않는 것과 같은 이유다.
     * 공식 홈페이지에서는 그 이유를 아래와 같이 설명하고있다.
     *
     * | 소규모 프로젝트에는 예외 사양을 요구하면 생산성이 향상되고, 코드 품질이 향상될 수 있지만, 대규모 프로젝트에서는
     * | 생산성 저하 및 코드품질 향상 효과가 미미하다라고 볼 수 있다.
     *
     * 이 의미를 예를 들어 설명하자면 프로젝트를 진행하는 중에 아래의 코드에서의 throwIOException 함수를 여러 코드에서
     * 사용한다고 해보자. 이 함수를 사용할 때마다 사용하는 모든 소스코드에서 이 함수에 대한 예외처리를 각각 다 해줘야한다.
     * 이런 함수를 사용하는 코드가 많을수록 그 부담은 더 가중된다. 책임을 전가하지 말고 throwsIOException 함수 내부에서
     * 처리해주는게 부담도 덜 가중된다.
     */

    throwIOException()
}

fun throwIOException(): Int {
    throw IOException()
}

// 출력 결과는
/*
Exception in thread "main" java.io.IOException
	at chap07._8_1_TryCatchExamKt.throwIOException(8_1_TryCatchExam.kt:29)
	at chap07._8_1_TryCatchExamKt.main(8_1_TryCatchExam.kt:25)
	at chap07._8_1_TryCatchExamKt.main(8_1_TryCatchExam.kt)

	컴파일상의 예외처리는 강제하지 않지만 처리를 하지않으므로 예외가 발생하게 되고 프로그램을 종료시킨다.

	이제 문법을 살펴보자면 기본적인 형식은 자바와 똑같다고 볼 수 있는데 아래의 예제를 보면 알 수 있다.
	try, catch, finally 까지의 코드 흐름은 자바와 완전 동일하다.

 */
