package chap10
/**
 * getter & setter
 * 클래스를 선언할 때에 getter와 setter를 선언해야 할 때가 있다. 코틀린은 getter와 setter를 자동으로 지원하지만
 * 간혹 getter와 setter에 추가적인 작업이 필요할 때가 있다. 이럴 때에는 별도의 키워드로 getter와 setter를 선언해줄 수 있다.
 *
 * 형식은 멤버변수를 선언해줄 때에 바로 뒤에 getter와 setter를 선언해줘야 한다. get과 set이라는 키워드로 선언해줄 수 있고,
 * author 필드의 getter처럼 간소화도 가능하다.
 */
class Book3() {
    private var title: String?
        get() {
            return title
        }
        set(value) {
            title = value
        }

    private var author: String?
        get() = author
        set(value) {
            this.author = value
        }
}
