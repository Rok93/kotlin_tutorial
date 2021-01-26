package chap06

import kotlin.random.Random

fun main() {
    val gen = NumberGenerator()

    do {
        val number = gen.generateRandomNumber()
        println(number)
    } while (number % 2 == 0)
}

class NumberGenerator {
    private val random = Random

    fun generateRandomNumber(): Int {
        return random.nextInt(100);
    }
}
