package one

import io.kotest.matchers.shouldBe
import kotlin.collections.HashMap

fun twoSum(nums: IntArray, target: Int): IntArray {
    val dict = HashMap<Int, Int>()

    for (i in nums.indices) {
        dict[nums[i]] = i
    }

    for (i in nums.indices) {
        val second = dict[target - nums[i]]
        if (second is Int && second != i) {
            return intArrayOf(i, dict[target - nums[i]] as Int)
        }
    }

    return intArrayOf(0, 0)
}

fun test() {
    twoSum(intArrayOf(1,2,3), 5) shouldBe intArrayOf(1, 2)
    twoSum(intArrayOf(-1, 12, 8, 55), 54) shouldBe intArrayOf(0, 3)
}
