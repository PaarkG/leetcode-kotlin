package threeHundredThirtyTwo

import io.kotest.matchers.shouldBe

fun coinChange(coins: IntArray, amount: Int): Int {
    val dp = IntArray(amount + 1) { Int.MAX_VALUE }
    dp[0] = 0

    for (i in 1 .. amount) {
        for (coin in coins) {
            val remainder = i - coin
            if (remainder >= 0 && dp[remainder] != Int.MAX_VALUE) {
                dp[i] = minOf(1 + dp[remainder], dp[i])
            }
        }
    }

    return if (dp[amount] == Int.MAX_VALUE) -1 else dp[amount]
}

fun test() {
    coinChange(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5) shouldBe 1
    coinChange(intArrayOf(5, 2, 3), 27) shouldBe 6
    coinChange(intArrayOf(5, 6, 3), 7) shouldBe -1
}
