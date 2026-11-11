package oneHundredSixtyNine

import io.kotest.matchers.shouldBe

fun majorityElement(nums: IntArray): Int {
    nums.sort()

    var count = 1
    var prev = nums[0]

    for (i in 1 .. nums.lastIndex) {
        if (nums[i] == prev) {
            count++
        } else {
            count = 1
            prev = nums[i]
        }

        if (count > nums.size / 2) return prev
    }

    return -1
}

fun test() {
    majorityElement(intArrayOf(1, 2, 2, 4, 2)) shouldBe 2
    majorityElement(intArrayOf(1, 2, 5, 5, 5)) shouldBe 5
    majorityElement(intArrayOf(1, 9, 3, 9, 5, 9, 12, 9, 9)) shouldBe 9
}
