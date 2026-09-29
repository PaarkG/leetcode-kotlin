package oneHundredTwentyOne

import io.kotest.matchers.shouldBe

fun maxProfit(prices: IntArray): Int {
    var max = 0
    var minBuy = prices[0]
    for (price in prices) {
        minBuy = minOf(minBuy, price)
        max = maxOf(max, price - minBuy)
    }
    return max
}

fun test() {
    maxProfit(intArrayOf(1, 7)) shouldBe 6
    maxProfit(intArrayOf(1, 5, 2, 0, 3)) shouldBe 4
}
