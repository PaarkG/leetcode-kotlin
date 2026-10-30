package sevenHundredThirtyFive

import io.kotest.matchers.shouldBe
import java.util.Stack
import kotlin.math.abs

fun asteroidCollision(asteroids: IntArray): IntArray {
    val s = Stack<Int>()

    for (num in asteroids) {
        var curr = num
        var push = true
        while (s.isNotEmpty() && s.peek() > 0 && curr < 0) {
            val prev = s.pop()
            curr = if (abs(curr) > abs(prev)) curr
            else if (abs(curr) < abs(prev)) prev
            else {
                push = false
                break
            }
        }
        if (push) s.push(curr)
    }

    return s.toList().toIntArray()
}

fun test() {
    asteroidCollision(intArrayOf(5, -5, 0, 10)) shouldBe intArrayOf(0, 10)
    asteroidCollision(intArrayOf(1, 2, 3, 4, -5)) shouldBe intArrayOf(-5)
    asteroidCollision(intArrayOf(-5, 0, 5)) shouldBe intArrayOf(-5, 0, 5)
}
