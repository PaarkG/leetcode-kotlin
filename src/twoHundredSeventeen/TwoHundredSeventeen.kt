package twoHundredSeventeen

import io.kotest.matchers.shouldBe

fun containsDuplicate(nums: IntArray): Boolean {
    val set = HashSet<Int>()

    for (num in nums) {
        if (set.contains(num)) return true
        set.add(num)
    }

    return false
}

fun test() {
    containsDuplicate(intArrayOf(1, 2, 3, 4, 5)) shouldBe false
    containsDuplicate(intArrayOf(1, 2, 3, 4, 1, 5)) shouldBe true
    containsDuplicate(intArrayOf()) shouldBe false
}
