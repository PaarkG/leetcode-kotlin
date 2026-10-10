package twoThousandNineHundredNinetySix

import io.kotest.matchers.shouldBe

fun missingInteger(nums: IntArray): Int {
    var sum = nums[0]
    var done = false
    var i = 1
    while (!done && i < nums.size) {
        if (nums[i] == nums[i - 1] + 1) {
            sum += nums[i]
        } else done = true
        i++
    }
    nums.sort()
    for (num in nums) if (num == sum) sum++
    return sum
}

fun test() {
    missingInteger(intArrayOf(1, 2, 3, 5, 6, 7)) shouldBe 8
    missingInteger(intArrayOf(1, 3, 2, 5, 8)) shouldBe 4
    missingInteger(intArrayOf(2, 3, 5, 4)) shouldBe 6
}
