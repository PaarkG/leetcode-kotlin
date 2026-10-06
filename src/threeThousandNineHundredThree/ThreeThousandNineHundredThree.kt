package threeThousandNineHundredThree

import io.kotest.matchers.shouldBe

fun firstStableIndex(nums: IntArray, k: Int): Int {
    val max = IntArray(nums.size)
    val min = IntArray(nums.size)

    max[0] = nums[0]

    for (i in 1 ..< nums.size) {
        max[i] = maxOf(max[i - 1], nums[i])
    }

    min[nums.size - 1] = nums[nums.size - 1]

    var best = -1

    for (i in nums.size - 1 downTo 0) {
        if (i + 1 < nums.size) {
            min[i] = minOf(min[i + 1], nums[i])
        } else min[i] = nums[i]
        if (max[i] - min[i] <= k) best = i
    }

    return best
}

fun test() {
    firstStableIndex(intArrayOf(3, 2, 1), 1) shouldBe -1
    firstStableIndex(intArrayOf(5, 0, 1, 4), 3) shouldBe 3
}
