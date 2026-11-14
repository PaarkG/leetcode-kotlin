package threeHundredThree

import io.kotest.matchers.shouldBe

class NumArray(val nums: IntArray) {
    fun sumRange(left: Int, right: Int): Int {
        var sum = 0
        for (i in left .. right) sum += nums[i]
        return sum
    }
}

fun test() {
    val arr = NumArray(intArrayOf(1, 2, 3, 4, 5))
    arr.sumRange(0, 3) shouldBe 10
    arr.sumRange(3, 3) shouldBe 4
    arr.sumRange(2, 4) shouldBe 12
}
