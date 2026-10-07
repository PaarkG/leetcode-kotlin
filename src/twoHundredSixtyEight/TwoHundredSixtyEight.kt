package twoHundredSixtyEight

import io.kotest.matchers.shouldBe

fun missingNumber(nums: IntArray): Int {
    nums.sort()
    for (i in 0..< nums.size) {
        if (nums[i] != i) return i
    }
    return nums[nums.size - 1] + 1
}

fun test() {
    missingNumber(intArrayOf(0, 1, 3)) shouldBe 2
    missingNumber(intArrayOf(1, 2, 3)) shouldBe 0
    missingNumber(intArrayOf(0, 1, 2)) shouldBe 3
}
