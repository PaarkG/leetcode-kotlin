package seventy

import io.kotest.matchers.shouldBe

fun climbStairs(n: Int): Int {
    return when {
        n <= 1 -> 1
        else -> climbStairs(n - 1) + climbStairs(n - 2)
    }
}

fun test() {
    climbStairs(2) shouldBe 2
    climbStairs(4) shouldBe 5
    climbStairs(7) shouldBe 21
}
