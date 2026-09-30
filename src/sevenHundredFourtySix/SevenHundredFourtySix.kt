package sevenHundredFourtySix

import io.kotest.matchers.shouldBe

fun minCostClimbingStairs(cost: IntArray): Int {
    val table = IntArray(cost.size + 1) { Int.MAX_VALUE }
    table[0] = cost[0]
    table[1] = cost[1]

    for (i in 2..<cost.size) {
        table[i] = minOf(table[i - 1], table[i - 2]) + cost[i]
    }

    return minOf(table[cost.size - 1], table[cost.size - 2])
}

fun test() {
    minCostClimbingStairs(intArrayOf(1, 2, 3, 4, 5)) shouldBe 6
    minCostClimbingStairs(intArrayOf(1, 100, 1, 1, 100)) shouldBe 3
}
