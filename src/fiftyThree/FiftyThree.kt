package fiftyThree

import io.kotest.matchers.shouldBe

fun maxSubArray(nums: IntArray): Int {
    var max = nums[0]
    var prev = nums[0]

    for (i in 1 ..< nums.size) {
        val curr = nums[i]
        prev = maxOf(prev + curr, curr)
        max = maxOf(prev, max)
    }

    return max
}

fun test() {
    maxSubArray(intArrayOf(1, -1, 2, 3)) shouldBe 5
    maxSubArray(intArrayOf(4, -2, 3)) shouldBe 5
    maxSubArray(intArrayOf(-4, -2, -1)) shouldBe -1
}
