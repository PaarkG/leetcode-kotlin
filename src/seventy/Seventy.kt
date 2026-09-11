package seventy

import io.kotest.matchers.shouldBe

fun climbStairs(n: Int): Int {
    return climbStairs(n, HashMap<Int, Int>())
}

fun climbStairs(n: Int, cache: HashMap<Int, Int>): Int {
    return when {
        cache.contains(n) -> cache.getValue(n)
        n <= 1 -> {
            cache[n] = 1
            return 1
        }
        else -> {
            val ways = climbStairs(n - 1, cache) + climbStairs(n - 2, cache)
            cache[n] = ways
            return ways
        }
    }
}

fun test() {
    climbStairs(2) shouldBe 2
    climbStairs(4) shouldBe 5
    climbStairs(7) shouldBe 21
}
