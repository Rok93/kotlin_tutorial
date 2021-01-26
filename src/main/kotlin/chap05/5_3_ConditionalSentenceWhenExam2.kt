package chap05

fun main(args: Array<String>) {
    val unknownObject: Any = "ABCDEFG"

    when (unknownObject) {
        is TestClass -> {
            println(unknownObject.print())
        }
        is String -> {
            println(unknownObject.length)
        }
        is Int -> {
            println(unknownObject.minus(10))
        }
    }
}

class TestClass {
    fun print() {
        println("TestClass의 print메서드 실행")
    }
}
