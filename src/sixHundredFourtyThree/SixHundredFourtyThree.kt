package sixHundredFourtyThree

import io.kotest.matchers.shouldBe

fun findMaxAverage(nums: IntArray, k: Int): Double {
    var curr = 0.0
    for (i in 0 ..< k) {
        curr += nums[i]
    }

    var max = curr
    for (i in k ..< nums.size) {
        curr -= nums[i - k]
        curr += nums[i]
        max = maxOf(curr, max)
    }

    return max / k
}

fun test() {
    findMaxAverage(intArrayOf(1, 2, 3, -2, 5), 2) shouldBe 2.5
    findMaxAverage(intArrayOf(1, 2, 3, -2, 5), 3) shouldBe 2.0
    findMaxAverage(intArrayOf(60, -12, 8, 30), 2) shouldBe 24.0
}
