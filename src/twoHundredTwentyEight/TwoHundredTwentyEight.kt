package twoHundredTwentyEight

import io.kotest.matchers.shouldBe

fun summaryRanges(nums: IntArray): List<String> {
    if (nums.size == 0) return listOf()

    var left = 0
    var right = 0

    val list = mutableListOf<String>()

    while (right < nums.size - 1) {
        if (right + 1 < nums.size && nums[right + 1] > nums[right] + 1) {
            if (right == left) list.add(nums[left].toString())
            else list.add(nums[left].toString() + "->" + nums[right].toString())
            left = right + 1
        }
        right++
    }

    if (right == left) list.add(nums[left].toString())
    else list.add(nums[left].toString() + "->" + nums[right].toString())

    return list
}

fun test() {
    summaryRanges(intArrayOf()) shouldBe listOf()
    summaryRanges(intArrayOf(1, 2, 3, 5, 6, 7, 8, 12, 13)) shouldBe listOf("1->3", "5->8", "12->13")
    summaryRanges(intArrayOf(-2, -1, 0, 1, 2, 5)) shouldBe listOf("-2->2", "5")
}
