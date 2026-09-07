package thirtyFive

import io.kotest.matchers.shouldBe

fun searchInsert(nums: IntArray, target: Int): Int {
    for (i in nums.indices) {
        if (nums[i] >= target) {
            return i
        }
    }

    return nums.size
}

fun test() {
    searchInsert(intArrayOf(1, 2, 3, 5), 3) shouldBe 2
    searchInsert(intArrayOf(1, 2, 3, 5), 6) shouldBe 4
    searchInsert(intArrayOf(1, 2, 3, 5), 4) shouldBe 3
}
