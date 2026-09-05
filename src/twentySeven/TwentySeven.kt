package twentySeven

import io.kotest.matchers.shouldBe

fun removeElement(nums: IntArray, `val`: Int): Int {
    var lo = 0
    var hi = nums.size - 1
    while (lo <= hi) {
        if (nums[lo] == `val`) {
            moveToEnd(nums, lo)
            hi--
        } else {
            lo++
        }
    }
    return lo
}

fun moveToEnd(nums: IntArray, index: Int) {
    for (i in index..< nums.size - 1) {
        val next = nums[i + 1]
        nums[i + 1] = nums[i]
        nums[i] = next
    }
}

fun test() {
    val arr1 = intArrayOf(1, 2, 3, 2, 9, 5)
    val k1 = removeElement(arr1, 2)
    k1 shouldBe 4
    arr1.sort(0, k1)
    val arr1Sorted = intArrayOf(1, 3, 5, 9)
    for (i in 0 ..< k1) {
        arr1[i] shouldBe arr1Sorted[i]
    }

    val arr2 = intArrayOf(52, 3, 1)
    val k2 = removeElement(arr2, 52)
    k2 shouldBe 2
    arr2.sort(0, k2)
    val arr2Sorted = intArrayOf(1, 3)
    for (i in 0 ..< k2) {
        arr2[i] shouldBe arr2Sorted[i]
    }
}