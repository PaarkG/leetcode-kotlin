package threeThousandSevenHundredThirtySix

import io.kotest.matchers.shouldBe

fun minMoves(nums: IntArray): Int {
    var max = 0
    var acc = 0

    for (num in nums) {
        acc += num
        max = maxOf(max, num)
    }

    val req = max * nums.size

    return req - acc
}

fun test() {
    minMoves(intArrayOf(1, 2, 3)) shouldBe 3
    minMoves(intArrayOf(12, 0, 5)) shouldBe 19
    minMoves(intArrayOf(23, 2, 18)) shouldBe 26
}
