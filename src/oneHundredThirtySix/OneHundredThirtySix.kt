package oneHundredThirtySix

import io.kotest.matchers.shouldBe

fun singleNumber(nums: IntArray): Int {
    var acc = 0
    for (num in nums) acc = acc xor num
    return acc
}

fun test() {
    singleNumber(intArrayOf(5, 12, 2, 5, 2)) shouldBe 12
    singleNumber(intArrayOf(0)) shouldBe 0
    singleNumber(intArrayOf(12, 56, 32, 2345, 52, 52, 32, 56, 12)) shouldBe 2345
}
