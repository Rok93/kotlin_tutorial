package chap06

// indices: index의 복수형!
fun main() {
    val arr = arrayOf("A", "B", "C", "D", "E")

    // for문에서 인덱스 사용하기
    for (idx in arr.indices) {
        println(arr[idx])
    }

    // for문에서 range 사용하기 (until도 동일하게 사용할 수 있는 듯 하다)
    for (idx in 0..arr.size - 1) {
        println(arr[idx])
    }
}
