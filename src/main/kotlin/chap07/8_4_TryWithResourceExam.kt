package chap07

import java.io.File
import java.io.FileNotFoundException

fun main() {
    /**
     * 자바에서 try-catch-finally 를 쓰는 용도중 리소스의 반환의 용도도 있엇다. 자바에도 try-with-resource 가 있지만
     * 쓰기 불편하고 가독성이 좋지 않았던 문제가 있었다.
     * 코틀린에서는 그래서 예외처리와 리소스반환을 별개의 문제로 처리했다. 그래서 코틀린의 try-with-resource는
     * 엄연히 보자면 예외처리는 아니다. 그리고 부를 때에도 try-with-resource라기 보다는 사용하는 메서드명대로 use라고 부르는게 적합할 것이다.
     *
     * 아래의 use문의 예제이다. 텍스트 파일을 쓰고, 다시 읽어서 출력하는 코드이다. 여기서 use문을 사용하면 정의된 코드블록 내에서 스트림을
     * 사용한 후에 코드블록이 종료되면 자동으로 close() 처리가 된다.
     * 아까 말했듯이 예외처리와는 다른영역이다.
     *
     * 파일을 읽거나 쓸 때 FileNotFoundException이 나타날 수 있다. 그래서 아래의 파일을 읽는 부분에는
     * 예외처리를 해주었다. 하지만 그 위의 파일을 쓰는 부분에서 보이다시피 예외처리를 강제하지는 않는다.
     */

    val path = "D:\\test.txt"
    val writeString = "Hello World!"

    File(path).outputStream().use {
        it.write(writeString.toByteArray())
    }

    try {
        File(path).inputStream().use {
            println(String(it.readBytes()))
        }
    } catch (e: FileNotFoundException) {
        println("File Not Found!")
    }
}
