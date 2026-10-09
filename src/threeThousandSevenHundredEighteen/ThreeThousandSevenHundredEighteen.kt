package threeThousandSevenHundredEighteen

import io.kotest.matchers.shouldBe

fun missingMultiple(nums: IntArray, k: Int): Int {
    nums.sort()
    var acc = k
    for (i in nums.indices) {
        if (nums[i] == acc) acc += k
    }

    return acc
}

fun test() {
    missingMultiple(intArrayOf(1, 2, 3, 4, 5), 5) shouldBe 10
    missingMultiple(intArrayOf(2, 6, 7, 4, 9, 8, 3), 2) shouldBe 10
    missingMultiple(intArrayOf(2, 6, 7, 4, 9, 8, 1), 3) shouldBe 3
}
