package twoThousandTwoHundredFifteen

import io.kotest.matchers.shouldBe

fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val set1 = nums1.toHashSet()
    val set2 = nums2.toHashSet()

    for (num in nums1) {
        set2.remove(num)
    }

    for (num in nums2) {
        set1.remove(num)
    }

    return listOf(set1.toList(), set2.toList())
}

fun test() {
    findDifference(intArrayOf(1, 2, 3, 4, 5), intArrayOf(1, 2, 3, 4, 5)) shouldBe listOf(listOf(), listOf())
    findDifference(intArrayOf(1, 3, 5), intArrayOf(1, 3, 4)) shouldBe listOf(listOf(5), listOf(4))
    findDifference(intArrayOf(1, 2, 3), intArrayOf()) shouldBe listOf(listOf(1, 2, 3), listOf())
}
