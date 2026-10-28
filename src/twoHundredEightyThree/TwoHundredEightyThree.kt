package twoHundredEightyThree

import io.kotest.matchers.shouldBe

fun moveZeroes(nums: IntArray): Unit {
    var k = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            val temp = nums[k]
            nums[k] = nums[i]
            nums[i] = temp
            k++
        }
    }
}

fun test() {
    val arr1 = intArrayOf(1, 2, 3, 4)
    moveZeroes(arr1)
    arr1 shouldBe intArrayOf(1, 2, 3, 4)

    val arr2 = intArrayOf(0, 1, 0, 3, 4)
    moveZeroes(arr2)
    arr2 shouldBe intArrayOf(1, 3, 4, 0, 0)

    val arr3 = intArrayOf(0, -3, 5, 8, 0, 2, 3)
    moveZeroes(arr3)
    arr3 shouldBe intArrayOf(-3, 5, 8, 2, 3, 0, 0)
}
