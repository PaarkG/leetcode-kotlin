package sevenHundredTwentyFour

import io.kotest.matchers.shouldBe

fun pivotIndex(nums: IntArray): Int {
    var right = 0
    for (i in 1 ..< nums.size) right += nums[i]

    var left = 0
    var i = 0
    while (i < nums.size - 1 && left != right) {
        left += nums[i]
        i++
        right -= nums[i]
    }

    return if (left == right) i else -1
}

fun test() {
    pivotIndex(intArrayOf(1, 2, 3, 2, 1)) shouldBe 2
    pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)) shouldBe 3
}
