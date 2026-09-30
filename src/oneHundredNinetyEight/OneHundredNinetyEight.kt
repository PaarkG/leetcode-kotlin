package oneHundredNinetyEight

import io.kotest.matchers.shouldBe

fun rob(nums: IntArray): Int {
    val profit = IntArray(nums.size + 1) { 0 }
    profit[0] = 0
    profit[1] = nums[0]
    for (i in 2 .. nums.size) {
        profit[i] = maxOf(profit[i - 2] + nums[i - 1], profit[i - 1])
    }

    return profit[nums.size]
}

fun test() {
    rob(intArrayOf(1, 5, 2)) shouldBe 5
    rob(intArrayOf(1, 3, 5, 3)) shouldBe 6
    rob(intArrayOf(1)) shouldBe 1
}
