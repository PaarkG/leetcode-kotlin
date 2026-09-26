package threeThousandFiveHundredFifty

import io.kotest.matchers.shouldBe

fun smallestIndex(nums: IntArray): Int {
    for (i in nums.indices) if (sumDigits(nums[i]) == i) return i
    return -1
}

fun sumDigits(num: Int) = num.toString().toCharArray().fold(0) { acc, c -> acc + c.code - 48 }

fun test() {
    smallestIndex(intArrayOf(1, 2, 3, 12, 5)) shouldBe 3
    smallestIndex(intArrayOf(0)) shouldBe 0
    smallestIndex(intArrayOf(1, 2, 121, 111)) shouldBe 3
    smallestIndex(intArrayOf(5, 2)) shouldBe -1
}
