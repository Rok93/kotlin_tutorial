package chap10

/**
 * 그럼 생성자로의 접근을 막으려면 어떻게 해야할까? 그 이전에 여태까지 했던 예제코드들에도 constructor 키워드가 생략되어 있었다.
 * 클래스의 가시성을 설정해주려면 생략했던 constructor 키워드를 사용해줘야한다. 아래의 코드는 가시성이 설정된 클래스의 선언예제이다.
 *
 * 클래스를 먼저 보면 생성자를 private로 막아놨다. 즉 객체를 생성할 수 없다. 그래서 main함수에서의 객체생성코드는 에러가 발생한다.
 * 저 private를 public으로 변경하면 에러가 사라진다.
 */
fun main() {
//    NotAccessClass() // 컴파일 오류가 난다!
}

class NotAccessClass private constructor() {
    init {
        // 실행되지 않는 코드
    }
}
